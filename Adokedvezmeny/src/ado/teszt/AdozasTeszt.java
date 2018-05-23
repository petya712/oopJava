package ado.teszt;

import java.util.Scanner;


import ado.CsaladiAdokedvezmeny;

public class AdozasTeszt {

	public static void main(String[] args) {
		
		CsaladiAdokedvezmeny tomb[] = new CsaladiAdokedvezmeny[2]; //kettore allitottam be hogy gyorsabb legyen
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i< tomb.length;i++) {
			
			System.out.println("Adja meg a tipus nevet: ");
			String tipus = scanner.next();
			System.out.println("Adja meg a gyerekek szamat: ");
			int gyerekekszama = scanner.nextInt();
			
			tomb[i]= new CsaladiAdokedvezmeny(tipus, gyerekekszama);
		}
		
		for(CsaladiAdokedvezmeny valami : tomb) {
			System.out.println(valami);
		}
		
		float max=0;
		int seged=0;
		for(int i=0;i<tomb.length;i++) {
			if(max < tomb[i].adokedvezmenyMerteke()) {
				max=tomb[i].adokedvezmenyMerteke();
			}
			seged=i;
		}
		
		System.out.println("A legnagyobb szamitott adokedvezmeny tomb eleme: "+seged);
		int db=0;
		for(int i=0;i<tomb.length;i++) {
			if(tomb[i].getGyerekekszama()>=3) {
				db++;
			}
		}
		System.out.println("Csaladi adokedvezmeny 3 vagy tobb gyerek utan ennyien vesznek igenybe: "+db);

	}

}
