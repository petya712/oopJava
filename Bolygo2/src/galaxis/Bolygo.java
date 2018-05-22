package galaxis;

public class Bolygo extends Egitest {
	private float keringesiido;
	private int atmero;
	
	public Bolygo(String nev, float keringesiido, int atmero) {
		super(nev);
		this.keringesiido=keringesiido;
		this.atmero= atmero;
		
	}

	public float getKeringesiido() {
		return keringesiido;
	}

	public void setKeringesiido(float keringesiido) {
		this.keringesiido = keringesiido;
	}

	public int getAtmero() {
		return atmero;
	}

	public void setAtmero(int atmero) {
		this.atmero = atmero;
	}
	@Override
	public String toString() {
		return "Bolygo neve: "+ getNev()+ " Keringesi ido: "+ getKeringesiido()+ " Atmero: "+getAtmero();
		
	}
	
	public static boolean nagyobbE(Bolygo egyik, Bolygo masik) {
		if(egyik.getAtmero() > masik.getAtmero()) {
			return true;
		}else {
		return false;
		}
	}
	
	public static float rovidebbKeringesiido(Bolygo egyik, Bolygo masik) {
		if(egyik.getKeringesiido()< masik.getKeringesiido()) {
			return egyik.getKeringesiido();
		}else {
			return masik.getKeringesiido();
		}
	}
	/*private float folditomeg;
	float[] konstans = {(float)0.78,(float)0.39,(float)2.65,(float)1.17,(float)1.05,(float)1.23};
	
	public float[] getKonstans() {
		return konstans;
	}
																	//EZ SZAR, de ezen kívül mûködik
	public void setKonstans(float[] konstans) {
		this.konstans = konstans;
	}

	@Override
	public  float atszamitTomeg() {
		float tomeg;
		tomeg = (getFolditomeg() * getKonstans());
		return tomeg;
	}*/
	
	

}
