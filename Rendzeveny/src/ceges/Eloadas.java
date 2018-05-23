package ceges;

public class Eloadas extends Rendezveny{

	private String eloadoneve;
	private int oradij;
	
	public Eloadas(String nev ,String eloadoneve, int oradij) {
		super(nev);
		this.eloadoneve = eloadoneve;
		this.oradij = oradij;
	}
	
	public String getEloadoneve() {
		return eloadoneve;
	}

	public int getOradij() {
		return oradij;
	}

	//rendezveny neve, hossza, eloado
	@Override
	public String toString() {
		return "Rendezveny neve: "+getNev()+" hossza: "+getHossz()+" eloado neve: "+getEloadoneve()+" ara: "+ getAr();
	}
	
	public int getAr() {
		return getHossz() * getOradij();
	}
	
	public boolean hosszabbE(Eloadas egyik, Eloadas masik) {
		if(egyik.getHossz() > masik.getHossz()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int kisebbEgysegaru(Eloadas egyik, Eloadas masik) {
		if(egyik.getOradij()< masik.getOradij()) {
			return egyik.getOradij();
		}else {
			return masik.getOradij();
		}
	}
	
	
}
