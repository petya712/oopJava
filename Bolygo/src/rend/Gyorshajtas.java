package rend;


public class Gyorshajtas extends Szabalysertes {
	private int tullepte;

	public Gyorshajtas(int Alapbirsag, String Elkovetonev, int tullepte) {
		super(Alapbirsag, Elkovetonev);
		this.tullepte = tullepte;
	}
	public Gyorshajtas(int Alapbirsag, String Elkovetonev) {
		super(Alapbirsag,Elkovetonev);
		
	
		
	}
	public static boolean tobbE(Gyorshajtas egyik, Gyorshajtas masik) {
		return ((egyik.Fizetendo()) > (masik.Fizetendo()));
	}


	@Override
	public int Fizetendo() {
		return getAlapbirsag() * (tullepte/100+1);
	}
	
	
	public String toString() {
		String message="Elkoveto neve: "+ getElkovetonev()+ " Fizetendo birsag: "+ Fizetendo();
		return message;
	}
	
	
	
}
