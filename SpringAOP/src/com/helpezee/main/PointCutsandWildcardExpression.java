package com.helpezee.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.helpezee.service.Shape;

public class PointCutsandWildcardExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Shape shape=ctx.getBean("shapeService",Shape.class);
		System.out.println(shape.getCircle().getName());
	}

}
