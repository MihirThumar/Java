package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Sprite implements InitializingBean,DisposableBean{
		private int price;

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public Sprite() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Sprite [price=" + price + "]";
		}

		public void afterPropertiesSet() throws Exception {
			
			//init Method
			System.out.println("Init method : spirite");
			
		}

		public void destroy() throws Exception {
			
			//Destroy Method
			System.out.println("Destroy method : spirite khatam ho gyi");
		}
		
		
}
