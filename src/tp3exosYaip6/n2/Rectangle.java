package tp3exosYaip6.n2;

public class Rectangle implements GeometricObject {
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	
	@Override
	public double getArea() {
		return width*length;
	}
	
	@Override
	public double getPerimeter() {
		return 2*(width+length);
	}
	
	public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4.0, 5.0);
        Rectangle rectangle2 = new Rectangle(7.0, 3.0);

        System.out.println(rectangle1);
        System.out.println(rectangle2);

        System.out.println("Area of rectangle1: " + rectangle1.getArea());
        System.out.println("Perimeter of rectangle1: " + rectangle1.getPerimeter());

        System.out.println("Area of rectangle2: " + rectangle2.getArea());
        System.out.println("Perimeter of rectangle2: " + rectangle2.getPerimeter());
    }
	
	
}
