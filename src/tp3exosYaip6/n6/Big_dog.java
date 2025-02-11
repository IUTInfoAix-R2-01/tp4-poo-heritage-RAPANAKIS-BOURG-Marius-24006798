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
}
