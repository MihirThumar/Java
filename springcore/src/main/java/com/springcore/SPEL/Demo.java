package com.springcore.SPEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
		
		@Value("#{20+10}")
		private int x;
		
		@Value("#{1+8}")
		private int y;
		
		@Value("#{T(java.lang.Math).sqrt(25) }")
		private double z;
		
		@Value("#{T(java.lang.Math).PI }")
		private double e;
		
		@Value("#{new java.lang.String('Mihir Thumar')}")
		private String name;
		
		@Value("#{8>3}")
		private boolean isActive;
		
		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		
		
		
		public double getE() {
			return e;
		}

		public void setE(double e) {
			this.e = e;
		}

		public double getZ() {
			return z;
		}

		public void setZ(double z) {
			this.z = z;
		}

		@Override
		public String toString() {
			return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
					+ "]";
		}

		
}
