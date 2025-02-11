package Cycles;

public class test {

	public static void main(String[] args) {
		Velo v1 = new Velo();
		Velo v2 = new Velo(10.0,5.0);
		Velo v3 = new Velo(10.0);
		
		VeloElectrique ve1 = new VeloElectrique();
		VeloElectrique ve2 = new VeloElectrique(10.0,5.0);
		VeloElectrique ve3 = new VeloElectrique(10.0,5.0,30.0);
				
				
		System.out.println('\n');
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		System.out.println('\n');
		System.out.println(ve1);
		System.out.println(ve2);
		System.out.println(ve3);
		
		System.out.println('\n');
		System.out.println(ve1.getBraquet());
		System.out.println(ve2.getBraquet());
		System.out.println(ve3.getBraquet());
		
		System.out.println('\n');
		System.out.println(ve1.getPuissance(15.0));
		System.out.println(ve2.getPuissance(15.0));
		System.out.println(ve3.getPuissance(15.0));
		
		
		
	}

}
