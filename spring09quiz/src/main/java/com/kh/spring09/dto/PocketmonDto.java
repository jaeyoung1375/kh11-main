package com.kh.spring09.dto;

import lombok.Data;

@Data//setter + getter + toString() + equals() + hashCode() 생성
public class PocketmonDto {
	private int no;
	private String name;
	private String type;
}
