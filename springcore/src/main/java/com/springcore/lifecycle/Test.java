package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
			public static void main(String[] args) {
					AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
					// Register shutdown hook -- Important
					context.registerShutdownHook();
					
//					Pizza p1 = (Pizza)context.getBean("p1");
//					System.out.println(p1);
//					
//					System.out.println("------------------------------------------------------------------");
//					
//					Sprite s1 = (Sprite) context.getBean("s1");
//					System.out.println(s1);
//					
//					System.out.println("+++++++++++++++++++++++++++++++++++");
					
					Chatani c1 = (Chatani)context.getBean("c1");
					System.out.println(c1);
			}																															
}
