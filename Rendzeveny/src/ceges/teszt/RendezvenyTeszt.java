package ceges.teszt;

import java.util.Scanner;

import ceges.Eloadas;

public class RendezvenyTeszt {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		Eloadas[] tomb =new Eloadas[2];
		
		for(int i=0;i<tomb.length;i++) {
			System.out.println("Rendezveny neve: ");
			String rendneve = scanner.next();
			System.out.println("Eloado neve: ");
			String eloadoneve = scanner.next();
			System.out.println("Oradij: ");
			int oradij= scanner.nextInt();
			
			tomb[i]= new Eloadas(rendneve,eloadoneve,oradij);
			
		}
		
		for(Eloadas valami : tomb) {
			System.out.println(valami);
		}

		int SUM=0;
		for(int i=0;i<tomb.length;i++) {
			SUM=SUM+tomb[i].getAr();
		}
		
		System.out.println("Az eloadasok ara: "+SUM);
		
		int min=0;
		int seged=0;
		for(int i=0;i<tomb.length;i++) {
			if(min > tomb[i].getOradij()) {
				min=tomb[i].getOradij();
				seged=i;
			}
		}
		
		System.out.println("Legkisebb egysegaru eloadas adatai: "+tomb[seged].getNev()+" "+tomb[seged].getAr()+" "+tomb[seged].getHossz()+" ora");
		
	}

}
