package tp3exosYaip4.n6;

public class Cat extends Mammal{

	public Cat(String name) {
		super(name);
	}

	
	@Override
	public String toString() {
		return "Cat ["+super.toString()+"]";
	}
	
	public void greets() {
		System.out.println("Meow");
	}
	
}
