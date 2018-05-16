package rend.teszt;

import java.util.Scanner;

import rend.Gyorshajtas;


public class Szabalyteszt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Gyorshajtas[] tomb = new Gyorshajtas[5];
		for (int i = 0; i < tomb.length; i++) {
			System.out.println("Add meg a(z) "+(i+1)+". Fizetendo birsag  es Gyorshajto nevet:");
			tomb[i]= new Gyorshajtas(scanner.nextInt(),scanner.nextLine());
		}
		
		for (Gyorshajtas valami : tomb) {
			System.out.println(valami);
		}
		
		System.out.println("Még jó");
		
		int maxGyors;
		
		if(Gyorshajtas.tobbE(tomb[0], tomb[1])) {
			maxGyors= tomb[0].Fizetendo();
		}else { maxGyors= tomb[1].Fizetendo(); }
		
		for (int i = 2; i < 5; i++) {
			if (Gyorshajtas.tobbE(tomb[i], tomb[i+1])) {
				maxGyors = tomb[i].Fizetendo();
		}
			maxGyors = tomb[i+1].Fizetendo();
		}
		
		System.out.println("Legmagasabb birsagot elkovetendo neve: "+maxGyors);
	}

}
