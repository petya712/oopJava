package ado;

public class CsaladiAdokedvezmeny extends Adokedvezmeny{

		private int gyerekekszama;
		private int kedvezmenymerteke;
		
		private int[]Tomb = {10000,17500,33000};
		
		public CsaladiAdokedvezmeny(String tipus,int gyerekekszama) {
			super(tipus);
			if(gyerekekszama==1) {
			this.kedvezmenymerteke=Tomb[0];
			}else if(gyerekekszama==2) {
				this.kedvezmenymerteke=Tomb[1];
			}else if(gyerekekszama>=3) {
				this.kedvezmenymerteke=Tomb[2];
			}
			this.gyerekekszama=gyerekekszama;
		}

		public int getGyerekekszama() {
			return gyerekekszama;
		}


		public int getKedvezmenymerteke() {
			return kedvezmenymerteke;
		}

		public int adokedvezmenyMerteke() {
			int adokedvezmeny;
			adokedvezmeny = getGyerekekszama() * getKedvezmenymerteke();
			return adokedvezmeny;
			
		}
		
		//gyerekek szama, egy gyerekre juto kedvezmeny merteke, szamitott adokedvezmeny
		@Override
		public String toString() {
			return "Gyerekek szama: "+getGyerekekszama()+" egy gyer. juto kedv.: "+getKedvezmenymerteke()+" szamitott adokedvezmeny: "+adokedvezmenyMerteke();
			
		}
		
		public boolean nagyobbE(CsaladiAdokedvezmeny egyik, CsaladiAdokedvezmeny masik) {
			if(egyik.adokedvezmenyMerteke()>masik.adokedvezmenyMerteke()) {
				return true;
			}else {
				return false;
			}
		}
}
