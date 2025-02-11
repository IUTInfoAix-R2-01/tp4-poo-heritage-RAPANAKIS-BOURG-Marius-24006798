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
	
	public static void main(String[] args) {
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Buddy");

        System.out.println(dog1);
        System.out.println(dog2);

        dog1.greets();
        dog2.greets();
        dog1.greets(dog2);
    }
}