package rend;

public abstract class Szabalysertes {
	private String Elkovetonev;
	private int Alapbirsag;

	public Szabalysertes(int Alapbirsag, String Elkovetonev){
		this.Alapbirsag=Alapbirsag;
		this.Elkovetonev= Elkovetonev;
	}
	
	public int getAlapbirsag() {
	return Alapbirsag;
	}
	
	public String getElkovetonev() {
		return Elkovetonev;
	}
	
	public abstract int Fizetendo();
}