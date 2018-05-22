package galaxis.teszt;

import java.util.Scanner;

import galaxis.Bolygo;

public class BolygoTeszt {

	public static void main(String[] args) {
		
		Bolygo[] tomb = new Bolygo[8];
		
		tomb[0]= new Bolygo ("Merkur", (float)0.24 , 4878);
		tomb[1]= new Bolygo("Venusz", (float)0.62 , 12104);
		tomb[2]= new Bolygo ("Fold" , (float)1 , 12756);
		tomb[3]= new Bolygo ("Mars" , (float)1.88, 6794);
		tomb[4]= new Bolygo("Jupiter" , (float)11.86 , 142800);
		tomb[5]= new Bolygo("Szaturnusz", (float)29.46 , 120000);
		tomb[6]= new Bolygo("Uranusz", (float)84.04 , 50800);
		tomb[7]= new Bolygo("Neptunusz", (float)164.79, 48600);
		
		for (Bolygo valami : tomb) {
			System.out.println(valami);
		}
		
		float legkisebb;
		String nev;
		float kerido;
		int atmero;
		if(Bolygo.nagyobbE(tomb[0], tomb[1])){
			legkisebb = tomb[1].getAtmero();
			nev = tomb[1].getNev();
			kerido = tomb[1].getKeringesiido();
			atmero =tomb[1].getAtmero();
		}else {
			legkisebb = tomb[0].getAtmero();
			nev = tomb[0].getNev();
			kerido = tomb[0].getKeringesiido();
			atmero =tomb[0].getAtmero();
		}
		
		int i;
		for(i=2; i < tomb.length; i++) {
			if(legkisebb > tomb[i].getAtmero()) {
				legkisebb = tomb[i].getAtmero();
				nev = tomb[i].getNev();
				kerido = tomb[i].getKeringesiido();
				atmero =tomb[i].getAtmero();
			}
		}
		System.out.println("A legkisebb atmeroju bolygo adatai: "+nev+ " "+ kerido+ " "+atmero);
		int db =0;
		for (int j=0 ; j< tomb.length; j++) {
			if(Bolygo.rovidebbKeringesiido(tomb[2], tomb[j]) == tomb[j].getKeringesiido()) {
				db++;
			}
		}
		System.out.println("Ennyi bolygonak rovidebb a keringesi ideje mint a Folde: "+(db-1));
			
		
		
	}


}
