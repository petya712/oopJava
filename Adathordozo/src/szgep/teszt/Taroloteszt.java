package szgep.teszt;

import szgep.Merevlemez;
import java.util.Scanner;

public class Taroloteszt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Merevlemez[] tomb = new Merevlemez[5];
		for (int i = 0; i < tomb.length; i++) {
			
			System.out.println("Add meg a(z) "+(i+1)+". Merevlemez típusát, Kapacitását, Foglalt területét: ");
			tomb[i]= new Merevlemez(scanner.nextLine(),scanner.nextDouble(),scanner.nextDouble());
			
		}
		
		for (Merevlemez valami : tomb) {
			System.out.println(valami);
		}

		System.out.println("");
		
		double legtobb;
		String tipus;
		double foglalt;
		if(Merevlemez.tobbE(tomb[0], tomb[1])){
			legtobb = tomb[0].mennyiHely();
			tipus = tomb[0].getTipus();
			foglalt = tomb[0].getFoglalt();
		}else {
			legtobb = tomb[1].mennyiHely();
			tipus = tomb[1].getTipus();
			foglalt = tomb[1].getFoglalt();
		}
		
		for(int i=2 ; i< tomb.length; i++) {
			if(legtobb < tomb[i].mennyiHely()) {
				legtobb = tomb[i].mennyiHely();
				tipus = tomb[i].getTipus();
				foglalt = tomb[i].getFoglalt();
			}
		}
		
		System.out.println("legnagyobb szabad teruletu merevlemez adatai: "+tipus+" szabad hely: "+legtobb+ " foglalt terulet: "+ foglalt);
	
	//hány ilyen adathordozo van: szabadterület > foglalt terület
		
		int db =0;
		for (int i=0 ; i< tomb.length; i++) {
			if(tomb[i].mennyiHely() > tomb[i].getFoglalt()) {
				db++;
			}
		}
		
		System.out.println("Szabad terület nagyobb mint a foglalt terület, ennyi adathordozora igaz: "+db);
	}

}
