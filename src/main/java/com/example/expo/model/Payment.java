package com.example.expo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Payment {

	private int pid;
	
	private String status;
	
}
