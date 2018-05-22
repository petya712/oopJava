package rend.teszt;

import java.util.Scanner;

import rend.Gyorshajtas;


public class Szabalyteszt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Gyorshajtas[] tomb = new Gyorshajtas[5];
		for (int i = 0; i < tomb.length; i++) {
			
			System.out.println("Add meg a(z) "+(i+1)+". Alapbirsag, Gyorshajto nevet és a sebesseg tullepest %-ban:");
			tomb[i]= new Gyorshajtas(scanner.nextInt(),scanner.nextLine(),scanner.nextDouble());
			
		}
		
		
		for (Gyorshajtas valami : tomb) {
			System.out.println(valami);
		}
		
		System.out.println("");
		
		double legtobb;
		String neve;
		if(Gyorshajtas.tobbE(tomb[0], tomb[1])){
			legtobb = tomb[0].Fizetendo();
			neve = tomb[0].getElkovetonev();
		}else {
			legtobb = tomb[1].Fizetendo();
			neve = tomb[1].getElkovetonev();
		}
		
		for(int i=2 ; i< tomb.length; i++) {
			if(legtobb < tomb[i].Fizetendo()) {
				legtobb = tomb[i].Fizetendo();
				neve = tomb[i].getElkovetonev();
			}
		}
		
		System.out.println("A legtobbet fizeto gyorshajto: "+ neve);
		
		double SUM = 0;
		for(int i=0; i < tomb.length; i++) {
			SUM = SUM + tomb[i].Fizetendo();
			
		}
		
		System.out.println("Az atlag fizetendo birsag: " + (SUM/tomb.length));
		
	}

}
