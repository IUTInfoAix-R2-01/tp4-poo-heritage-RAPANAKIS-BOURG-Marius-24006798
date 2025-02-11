package tp3exosYaip6.n6;

public class Big_dog extends Dog {

	public Big_dog(String name) {
		super(name);
	}
	
	@Override
	public void greets() {
		System.out.println("Woow");
	}
	
	@Override
	public void greets(Dog another) {
		System.out.println("Woooow");
	}
	
	public void greets(Big_dog another) {
		System.out.println("Wooooooow");
	}
	
	public static void main(String[] args) {
        Big_dog bigDog1 = new Big_dog("Giant");
        Big_dog bigDog2 = new Big_dog("Titan");

        System.out.println(bigDog1);
        System.out.println(bigDog2);

        bigDog1.greets();
        bigDog2.greets();
        bigDog1.greets(bigDog2);
    }
}
