package entities;

import entities.enums.Color;
import model.entities.AbstractShape;

public class Circle extends AbstractShape{

	private Double radius;

	public Circle() {
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	@Override
	public double area( ) {
		return Math.PI * radius * radius;
	}
	
}
