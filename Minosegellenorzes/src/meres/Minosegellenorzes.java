package meres;

public abstract class Minosegellenorzes {
	
	private int tureshatar;

	public Minosegellenorzes(int tureshatar) {
		this.tureshatar = tureshatar;
	}
	
	public abstract double legnagyobbElteres(double ertek);
	
	public abstract double atlagosElteres();

	public int getTureshatar() {
		return tureshatar;
	}
}
