package com.springcore.SPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
		public static void main(String[] args) {
			ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/SPEl/config.xml");
			Demo demo = con.getBean("demo",Demo.class);
			
			System.out.println(demo);
			
//			SpelExpressionParser spe = new SpelExpressionParser();
//			Expression exp = spe.parseExpression("10+20");
//			System.out.println(exp.getValue());
			
		}
}
