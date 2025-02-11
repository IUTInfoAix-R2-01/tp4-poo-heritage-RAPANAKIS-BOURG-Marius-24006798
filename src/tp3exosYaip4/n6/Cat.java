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
	
	public static void main(String[] args) {
        Cat cat1 = new Cat("Whiskers");
        Cat cat2 = new Cat("Mittens");

        System.out.println(cat1);
        System.out.println(cat2);

        cat1.greets();
        cat2.greets();
    }
	
}
