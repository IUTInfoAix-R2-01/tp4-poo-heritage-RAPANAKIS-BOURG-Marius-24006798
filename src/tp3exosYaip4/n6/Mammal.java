package tp3exosYaip4.n6;

public class Mammal extends Animal {

	public Mammal(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Mammal ["+super.toString()+"]";
	}
	
	public static void main(String[] args) {
        Mammal mammal1 = new Mammal("Human");
        Mammal mammal2 = new Mammal("Monkey");

        System.out.println(mammal1);
        System.out.println(mammal2);
    }
}
