package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
		public static void main(String[] args) {
			ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/sterotype/config.xml");
			Student stu = con.getBean("ob",Student.class);
//			System.out.println(stu);
//			System.out.println(stu.getAddress());
//			System.out.println(stu.getAddress().getClass().getName());
			
			System.out.println(stu.hashCode());
			Student stu2 = con.getBean("ob",Student.class);
			System.out.println(stu2.hashCode());
			
			Teacher t1 =con.getBean("teacher",Teacher.class);
			Teacher t2 =con.getBean("teacher",Teacher.class);
			System.out.println(t1.hashCode());
			System.out.println(t2.hashCode());
		}
}
