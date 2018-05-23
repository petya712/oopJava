package aram.teszt;

import java.util.Scanner;

import aram.Eszkoz;

public class Fogyasztasteszt {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Eszkoz[] tomb = new Eszkoz[2];
		
		for(int i=0; i<tomb.length; i++) {
			System.out.println("kerem az "+(i+1)+". eszkoz egysegarat(35.31 ha kisebb 1320 és 37.75 ha nagyobb 1320): ");
			float egysegar = scanner.nextFloat();
			System.out.println("Kerem a "+(i+1)+". eszkoz nevet: ");
			String nev = scanner.next();
			System.out.println("Kerem az "+(i+1)+". eszkoz atlagosfogyasztast: ");
			float atlagosfogyasztas = scanner.nextFloat();
			System.out.println("Kerem a "+(i+1)+". eszkoz napi atlagos hasznalati idot: ");
			float bekapcsoltido = scanner.nextFloat();
			
			tomb[i]= new Eszkoz(egysegar,nev,atlagosfogyasztas,bekapcsoltido);
		}
		//legmagasabb napi fogyasztasu eszkoz ADATAI
		float max=0;
		int seged=0;
		for(int i=0;i<tomb.length;i++) {
			if(max < tomb[i].napiFogyasztas()) {
				max=tomb[i].napiFogyasztas();
			}
			seged=i;
		}
		System.out.println("Legmagasabb napi fogyasztasu eszkoz adatai: "+tomb[seged].getFogyasztasa()+" "+tomb[seged].getNev()+" "+tomb[seged].napiFogyasztas()+" "+tomb[seged].getNapiatlagoshasznalatiido());
		System.out.println("Napi osszkoltseg: "+napiosszkoltseg(tomb));
		
		//kiir minden adatot
		for(Eszkoz valami:tomb) {
			System.out.println(valami);
		}
		
		
		
	}


		public static float napiosszkoltseg(Eszkoz[] tomb) {
			float SUM=0;
			for(int i=0; i< tomb.length; i++) {
				SUM= SUM+tomb[i].napiFogyasztasdij();
			}
			return SUM;
		}
}
