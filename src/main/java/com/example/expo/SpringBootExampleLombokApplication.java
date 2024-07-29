package com.example.expo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.expo.model.OrderEntity;
import com.example.expo.model.Payment;

@SpringBootApplication
public class SpringBootExampleLombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleLombokApplication.class, args);
//		OrderEntity oe=new OrderEntity();
//		oe.setId(12);
//		oe.setOrderName("cake");
//		oe.setOrderStatus("done");
//		oe.setOrderType("online");
//		oe.getId();
//		System.out.println(oe);
		
	OrderEntity oe1=OrderEntity.builder().id(1).orderName("pizza")
			.orderStatus("done").orderType("cash").payment(Payment.builder().pid(1).status("done").build()).build();
		
	System.out.println(oe1);
	}
}
