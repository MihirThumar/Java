package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AB {
			public static void main(String[] args) {
				
				ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/ref/ref.config.xml");
				A a =(A)context.getBean("aref");
				System.out.println(a.getX());
				System.out.println(a.getOb().getY());
				System.out.println(a);
			}
}
