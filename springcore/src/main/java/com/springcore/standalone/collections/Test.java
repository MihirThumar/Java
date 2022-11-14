package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
			public static void main(String[] args) {
				ApplicationContext con = new ClassPathXmlApplicationContext(" com/springcore/standalone/collections/aloneconfig.xml");
				Person per = con.getBean("person1",Person.class);
				
				System.out.println(per);
				System.out.println(per.getFriends().getClass().getName());
				
				System.out.println("---------------------------------------------");
				
				System.out.println(per.getFeestructure());
				System.out.println(per.getFeestructure().getClass());
				
				System.out.println("++++++++++++++++++++++++++++");
				
				System.out.println(per.getProp());
				
				//				Person per2 = con.getBean("person2",Person.class);			
				//				System.out.println(per2);								
			}
}
