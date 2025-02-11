package tp3exosYaip6.n6;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}
	
	@Override
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
