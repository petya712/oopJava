package rend;


public class Gyorshajtas extends Szabalysertes {
	private double tullepte;

	public Gyorshajtas(int Alapbirsag, String Elkovetonev, double tullepte) {
		super(Alapbirsag, Elkovetonev);
		this.tullepte = tullepte;
	}


	public double getTullepte() {
		return tullepte;
	}



	public void setTullepte(double tullepte) {
		this.tullepte = tullepte;
	}
	
	@Override
	public double Fizetendo() {
		
		return (getAlapbirsag() * (getTullepte()/100+1));
	}



	@Override
	public String toString() {
		return "Elkoveto neve: "+ getElkovetonev()+ " Fizetendo birsag: "+ Fizetendo();
		
	}
	
	public static boolean tobbE(Gyorshajtas egyik, Gyorshajtas masik) {
		if(egyik.Fizetendo() > masik.Fizetendo()) {
			return true;
		}else {
		return false;
		}
	}
	
}
