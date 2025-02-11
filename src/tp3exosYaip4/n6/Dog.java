package tp3exosYaip4.n6;

public class Dog extends Mammal{

	public Dog(String name) {
		super(name);
	}

	
	@Override
	public String toString() {
		return "Dog ["+super.toString()+"]";
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooof");
	}
}