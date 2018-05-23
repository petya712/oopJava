package galaxis;

public class Bolygo extends Egitest {
	private float keringesiido;
	private int atmero;
	public float[] konstans = {(float)0.78,(float)0.39,(float)2.65,(float)1.17,(float)1.05,(float)1.23};
	
	public Bolygo(String nev, float keringesiido, int atmero) {
		super(nev);
		this.keringesiido=keringesiido;
		this.atmero= atmero;
		
	}

	public float getKeringesiido() {
		return keringesiido;
	}

	public int getAtmero() {
		return atmero;
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
	

	@Override
	public float atszamitTomeg(int tomeg, int index) {
		return tomeg * konstans[index];
	}
	
	

}
