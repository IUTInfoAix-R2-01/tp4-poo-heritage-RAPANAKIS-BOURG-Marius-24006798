package Cycles;

public class VeloElectrique extends Velo {
	private static double DEFAULT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public static double getDEFAULT_FACTEUR_PUISSANCE_MOTEUR() {
		return DEFAULT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	
	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}

	public VeloElectrique(double braquet, double diamRoue, double facteurPuissanceMoteur) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}

	public VeloElectrique(double diamRoue, double facteurPuissanceMoteur) {
		super(0.0, diamRoue);
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public VeloElectrique() {
		super(0.0, 0.0);
		this.facteurPuissanceMoteur = 0.0;
	}

	@Override
	public String toString() {
		return "VeloElectrique[facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	public static void main() {
		
		VeloElectrique ve1 = new VeloElectrique();
		VeloElectrique ve2 = new VeloElectrique(10.0,5.0);
		VeloElectrique ve3 = new VeloElectrique(10.0,5.0,30.0);
		
		System.out.println('\n');
		System.out.println(ve1);
		System.out.println(ve2);
		System.out.println(ve3);
		
		System.out.println('\n');
		System.out.println(ve1.getFacteurPuissanceMoteur());
		System.out.println(ve2.getFacteurPuissanceMoteur());
		System.out.println(ve3.getFacteurPuissanceMoteur());
		
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
