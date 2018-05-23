package aram;

public class Eszkoz extends Fogyasztas{
	private String nev;
	private float fogyasztasa;
	private float napiatlagoshasznalatiido;
	
	public Eszkoz(float egysegar, String nev, float fogyasztasa, float napiatlagoshasznalatiido) {
		super(egysegar);
		this.nev = nev;
		this.fogyasztasa = fogyasztasa;
		this.napiatlagoshasznalatiido = napiatlagoshasznalatiido;
	}

	public float getFogyasztasa() {
		return fogyasztasa;
	}

	public float getNapiatlagoshasznalatiido() {
		return napiatlagoshasznalatiido;
	}
	
	public String getNev() {
		return nev;
	}
	
	public float napiFogyasztas() {
		float napifogyasztas;
		napifogyasztas = getFogyasztasa() * getNapiatlagoshasznalatiido();
		
		return napifogyasztas;
	}
	
	public float napiFogyasztasdij() {
		float dij;
		dij = (napiFogyasztas() * getEgysegar());
		
		return dij;
	}
	
	//nev, fogyasztas,napi fogyasztasa, napi fogyasztasi dij
	
	@Override
	public String toString() {
		return"Eszköz neve: "+getNev()+" Fogyasztasa: "+getFogyasztasa()+" Napi fogyasztasa: "+napiFogyasztas()+" Napi fogyasztasi dij: "+napiFogyasztasdij();
	}
	
	public boolean nagyobbEnapifogyasztas(Eszkoz egyik,Eszkoz masik) {
		if(egyik.napiFogyasztas()>masik.napiFogyasztas()) {
			return true;
		}else {
			return false;
		}
	}

}
