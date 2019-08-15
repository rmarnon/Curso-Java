package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
	
	public double width;
	public double height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double area () {
		return width * height;
	}
	
	public double perimeter () {
		return 2 * (width + height);
	}
	
	public double diagonal () {
		return Math.sqrt((width * width) + (height * height));
	}
	
}
