package com.kh.practice.point.cotroller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		// 원 넓이 : PI * 반지름 * 반지름
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double ca = Math.PI * c.getRadius() * c.getRadius();
		return c.toString() + " / " + ca;
	}

	public String calcCircum(int x, int y, int radius) {
		// 원 둘레 : PI * 반지름 * 2
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double cm = Math.PI * c.getRadius() * 2;
		return c.toString() + " / " + cm; 
	}
	
} // class end
