package galaxis.teszt;

import java.util.Scanner;

import galaxis.Bolygo;

public class BolygoTeszt {

	public static void main(String[] args) {
		
		Bolygo[] tomb = new Bolygo[8];
		
		tomb[0]= new Bolygo ("Merkur", 0.24f , 4878);
		tomb[1]= new Bolygo("Venusz", 0.62f , 12104);
		tomb[2]= new Bolygo ("Fold" , 1f , 12756);
		tomb[3]= new Bolygo ("Mars" , 1.88f, 6794);
		tomb[4]= new Bolygo("Jupiter" , 11.86f , 142800);
		tomb[5]= new Bolygo("Szaturnusz", 29.46f , 120000);
		tomb[6]= new Bolygo("Uranusz", 84.04f , 50800);
		tomb[7]= new Bolygo("Neptunusz", 164.79f, 48600);
		
		for (Bolygo valami : tomb) {
			System.out.println(valami.toString());
		}
		
		int minAtmero = 0;
		for (int i = 0; i < tomb.length; i++) {
			if(tomb[i].getAtmero() < tomb[minAtmero].getAtmero()) {
				minAtmero = i;
			}
		}
		System.out.println("A legkisebb atmeroju bolygo adatai: "+tomb[minAtmero].getNev()+ " "+ tomb[minAtmero].getKeringesiido()+ " "+tomb[minAtmero].getAtmero());
		
		
		int db = 0;
		for (int j = 0; j< tomb.length; j++) {
			if(tomb[j].getKeringesiido() < tomb[2].getKeringesiido()) {
				db++;
			}
		}
		System.out.println("Ennyi bolygonak rovidebb a keringesi ideje mint a Folde: "+(db));
		
		Scanner input = new Scanner (System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Add meg a tömeget: ");
			int tomeg = input.nextInt();
			System.out.println("Add meg az indexet (0-5): ");
			int index = input.nextInt();
			System.out.println(tomb[i].atszamitTomeg(tomeg, index));
		}
		
		input.close();
			
		
		
	}


}
