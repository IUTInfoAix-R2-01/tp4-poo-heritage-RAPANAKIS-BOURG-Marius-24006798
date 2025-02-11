package tp3exosYaip6.n2;

import static java.lang.Math.PI;

public class Circle implements GeometricObject {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	@Override
	public double getArea() {
		return (radius*radius)*Math.PI;
	}
	
	@Override
	public double getPerimeter() {
		return radius*2*Math.PI;
	}
	
}
