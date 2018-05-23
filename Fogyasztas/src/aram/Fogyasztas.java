package aram;

public abstract class Fogyasztas {

	private float egysegar;
	private float[] lehetsegesegysegar = {35.31f,37.75f};
	
	public Fogyasztas(float egysegar) {
		if(egysegar <= 1320) {
			this.egysegar = lehetsegesegysegar[0];
		}else if(egysegar > 1320) {
			this.egysegar = lehetsegesegysegar[1];
		}
	}

	public float getEgysegar() {
		return egysegar;
	}

	public void setEgysegar(float egysegar) {
		this.egysegar = egysegar;
	}
	
	public abstract float napiFogyasztas();
	
	
}
