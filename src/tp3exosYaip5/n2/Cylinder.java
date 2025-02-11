package tp3exosYaip5.n2;

public class Cylinder {
	private Circle base;
	private double height;
	
	public Cylinder(double radius, String color) {
	      base = new Circle(radius, color);
	      height = 1.0; 
	   }

	@Override
	public String toString() {
		return "Cylinder [base=" + base + ", height=" + height + "]";
	}
	
	public static void main(String[] args) {
		
		
		Cylinder cy1 = new Cylinder(15.0,"bleu");
		
		System.out.println(cy1);
	}
}
