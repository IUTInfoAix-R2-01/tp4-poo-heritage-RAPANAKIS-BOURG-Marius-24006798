package Cycles;

import java.util.Random;

public class Velo {
	
	private static double DEFAULT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;
	
	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
		this.genAlea = new Random();
	}

	public Velo(double braquet) {
		this.braquet = braquet;
		this.diamRoue = 0.0;
		this.genAlea = new Random();
	}

	public Velo() {
		this.braquet = 0.0;
		this.diamRoue = 0.0;
		this.genAlea = new Random();
	}

	public double getDEFAULT_BRAQUET() {
		return DEFAULT_BRAQUET;
	}

	public double getBraquet() {
		return braquet;
	}

	public double getDiamRoue() {
		return diamRoue;
	}

	public Random getGenAlea() {
		return genAlea;
	}

	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}

	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	@Override
	public String toString() {
		return "Velo[braquet="+braquet+", diamRoue="+diamRoue+"]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale*braquet*diamRoue*genAlea.nextDouble();
	}
	
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
