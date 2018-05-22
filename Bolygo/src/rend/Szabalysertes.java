package rend;

public abstract class Szabalysertes {
	private int Alapbirsag;
	private String Elkovetonev;
	

	public Szabalysertes(int Alapbirsag, String Elkovetonev){
		this.Alapbirsag=Alapbirsag;
		this.Elkovetonev= Elkovetonev;
	}
	
	
	
	public int getAlapbirsag() {
		return Alapbirsag;
	}



	public void setAlapbirsag(int alapbirsag) {
		Alapbirsag = alapbirsag;
	}



	public String getElkovetonev() {
		return Elkovetonev;
	}



	public void setElkovetonev(String elkovetonev) {
		Elkovetonev = elkovetonev;
	}



	public abstract double Fizetendo();
}