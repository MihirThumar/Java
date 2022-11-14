package com.springcore.lifecycle;

public class Pizza {
		 private double price;

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			System.out.println("setting price");
			this.price = price;
		}

		public Pizza() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Pizza [price=" + price + "]";
		}
		 
		public void hey()
		{
			System.out.println("Inside init method p");
		}
		
		public void by()
		{
			System.out.println("Inside Destroy method p");
		}
}
