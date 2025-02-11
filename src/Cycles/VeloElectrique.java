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

	public VeloElectrique(double braquet, double diamRoue) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = 0.0;
	}
	
	public VeloElectrique() {
		this.facteurPuissanceMoteur = 0.0;
	}

	@Override
	public String toString() {
		return "VeloElectrique[facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	

	
	
}
