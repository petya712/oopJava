package szgep;

public class Merevlemez extends Adathordozo {

	private double foglalt;

	public Merevlemez(String tipus, double kapacitas, double foglalt) {
		super(tipus, kapacitas);
		this.foglalt = foglalt;
	}

	public double getFoglalt() {
		return foglalt;
	}
//szabad terület = kapacitás - foglalt terület
	
	@Override
	public double mennyiHely() {
		double szabad;
		szabad = (getKapacitas()-getFoglalt());
		return szabad;
	}
	
	@Override
	public String toString() {
		return "Tipus: "+ getTipus()+ " Kapacitas: "+ getKapacitas()+" Foglalt terulet: "+getFoglalt()+ " Szabad terulet: "+mennyiHely();
		
	}
	
	public static boolean tobbE(Merevlemez egyik, Merevlemez masik) {
		if(egyik.mennyiHely() > masik.mennyiHely()) {
			return true;
		}else {
		return false;
		}
	}
	
	public static double nagyobbKapacitasu(Merevlemez egyik, Merevlemez masik) {
		if(egyik.getKapacitas()< masik.getKapacitas()) {
			return egyik.getKapacitas();
		}else {
			return masik.getKapacitas();
		}
	}
	
}
