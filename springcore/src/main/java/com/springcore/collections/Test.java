package com.springcore.collections;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
		public static void main(String[] args) {
			ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
			
			Emp e1 = (Emp) con.getBean("emp1") ;
			System.out.println(e1.getName());
			System.out.println(e1.getAddress());
			System.out.println(e1.getPhones());
			System.out.println(e1.getCourses());
			System.out.println(e1.getProps());
			System.out.println(e1.getPhones().getClass().getName());
		}
}
