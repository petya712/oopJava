package meres;

public class Meres extends Minosegellenorzes{

	private String mereskorulmeny;
	
	private double[] eredmeny= new double[10];
	
	public Meres(int tureshatar, String mereskorulmeny) {
		super(tureshatar);
		this.mereskorulmeny = mereskorulmeny;
	}

	public String getMereskorulmeny() {
		return mereskorulmeny;
	}

	public void setEredmeny(double eredmeny, int index) {
		
		this.eredmeny[index] = eredmeny;
	}

	public double eredmenyAtlag() {
		double SUM=0;
		for(int i=0;i<eredmeny.length;i++) {
			SUM= SUM+ eredmeny[i];
		}
		double atlag = (SUM/eredmeny.length);
		return atlag;
	}
	
	public double legnagyobbElteres(double ertek) {
		double maxelteres=0;
		
		for(int i=0;i < eredmeny.length; i++) {
			if(ertek > eredmeny[i]) {
				if((ertek-eredmeny[i])>maxelteres) {
					maxelteres=ertek-eredmeny[i];
				}
			}else if((eredmeny[i]-ertek)>maxelteres) {
				maxelteres=eredmeny[i]-ertek;
			}
		}
		return maxelteres;
	}
	
	public double atlagosElteres() {
		double SUM=0;
		for(int i=0;i< eredmeny.length;i++) {
			if(15 > eredmeny[i]) {
				SUM=SUM+(15-eredmeny[i]);
			}else {
				SUM=SUM+(eredmeny[i]-15);
			}
		}
	
		double atlag =(SUM/eredmeny.length);
		return atlag;
	}
	
	public String toString() {
		return "Meres korulmenye: "+getMereskorulmeny()+" Meres eredmenyek atlaga: "+eredmenyAtlag();
	}
	
	public boolean tureshataronBelulE() {
		if(atlagosElteres()<=getTureshatar()) {
			return true;
		}else {
			return false;
		}
	}
	
	
}

