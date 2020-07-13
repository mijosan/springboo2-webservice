package com.example.demo.web.dto;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class HelloResponseDtoTest {
	
	@Test
	public void �Һ�_���_�׽�Ʈ() {
		//given
		String name = "test";
		int amount = 1000;
		
		//when
		HelloResponseDto dto = new HelloResponseDto(name, amount);
		
		//then
		assertThat(dto.getName()).isEqualTo(name); //asertThat : asertj��� �׽�Ʈ ���� ���̺귯���� ���� �޼ҵ��Դϴ�.
		assertThat(dto.getAmount()).isEqualTo(amount); //isEqualTo : assertj�� ���� �� �޼ҵ��Դϴ�.
	}
}
