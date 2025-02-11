package tp3exosYaip6.n6;

public abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void greets();
	
	public static void main(String[] args) {
        Animal cat = new Cat("Whiskers");
        Animal dog = new Dog("Rex");
        Animal bigDog = new Big_dog("Giant");

        cat.greets();
        dog.greets();
        bigDog.greets();
    }
}