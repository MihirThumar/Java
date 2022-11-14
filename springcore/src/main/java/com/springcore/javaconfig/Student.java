package com.springcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {
		
		private Pizza pizza;
		
		public Student(Pizza pizza) {
			super();
			this.pizza = pizza;
		}

		public Pizza getPizza() {
			return pizza;
		}

		public void setPizza(Pizza pizza) {
			this.pizza = pizza;
		}
		
		public void study()
		{
			this.pizza.display();
			System.out.println("Student is playing Games");
		}
		
}
