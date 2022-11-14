package com.springcore.ci;

public class Adition {
		private int a;
		private int b;
		public Adition(double a, double b) {
			super();
			this.a =(int) a;
			this.b = (int)b;
			System.out.println("double");
		}
		public Adition(int a, int b) {
			super();
			this.a = a;
			this.b = b;
			System.out.println("int");
		}
		public Adition(String a, String b) {
			super();
			this.a = Integer.parseInt(a);
			this.b = Integer.parseInt(b);
			System.out.println("String");
		}
		
		public void dosum()
		{
			System.out.println("The Value of a is : "+ a);
			System.out.println("The Value of b is : "+ b);
		}
}
