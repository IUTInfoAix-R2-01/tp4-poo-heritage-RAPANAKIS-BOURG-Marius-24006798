package tp3exosYaip5.n2;

public class Circle {
	private double radius;
	private String color;
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}



	public static void main(String[] args) {
        Circle circle1 = new Circle(1.0,"rouge");

        System.out.println(circle1);
    }
}
