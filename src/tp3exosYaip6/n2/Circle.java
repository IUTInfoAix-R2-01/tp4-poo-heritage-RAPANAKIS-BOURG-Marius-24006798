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
	
	public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(10.0);

        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Perimeter of circle1: " + circle1.getPerimeter());

        System.out.println("Area of circle2: " + circle2.getArea());
        System.out.println("Perimeter of circle2: " + circle2.getPerimeter());
    }
	
}
