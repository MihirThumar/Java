package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;


@Configuration

public class JavaConfig {
		
	    @Bean 
		public Pizza getPizza()
		{
			return new Pizza();
		}
	
	
		@Bean(name = {"aa","bb","cc"})
		public Student getStudent()
		{
			// creating a new student object
			Student stu = new Student(getPizza());
			return stu;
			
			
		}
	
}
