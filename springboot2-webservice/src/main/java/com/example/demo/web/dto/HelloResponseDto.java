package com.example.demo.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor //����� ��� final�ʵ尡 ���Ե� �����ڸ� ������ �ݴϴ�.
public class HelloResponseDto {
	
	private final String name;
	private final int amount;
	
}
