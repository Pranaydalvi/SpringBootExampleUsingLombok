package com.example.expo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor(access= AccessLevel.PRIVATE)
//@EqualsAndHashCode
//@RequiredArgsConstructor
@Data
@Builder
public class OrderEntity {

	private int id;
	
	private String orderName;
	
	private String orderStatus;
	
	private String orderType;
	
	private Payment payment;
}
