package ceges;

public abstract class Rendezveny {

	private String nev;
	private int hossz;
	
	public Rendezveny(String nev) {
		this.nev=nev;
		this.hossz=1;
	}
	
	public String getNev() {
		return nev;
	}

	public int getHossz() {
		return hossz;
	}
	public String toString() {
		return "Neve: "+getNev()+" hossza: "+getHossz();
	}
	
	public abstract int getAr();
}
