package tp3exosYaip4.n6;

public class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	public static void main(String[] args) {
        Animal animal1 = new Animal("Lion");
        Animal animal2 = new Animal("Elephant");

        System.out.println(animal1);
        System.out.println(animal2);
    }
	
	
	
}
