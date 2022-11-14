package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Chatani {
			private String type;

			public String getType() {
				return type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Chatani() {
				super();
				// TODO Auto-generated constructor stub
			}

			@Override
			public String toString() {
				return "Chatani [type=" + type + "]";
			}
			
			@PostConstruct
			public void start()
			{
				System.out.println("Starting Method");
			}
			
			@PreDestroy
			public void end()
			{
				System.out.println("ending Method");
			}
}
