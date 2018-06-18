package meres.teszt;

import java.util.Scanner;

import meres.Meres;

public class Meresteszt {

	public static void main(String[] args) {
	
		Meres[] tomb =new Meres[2];
		//be: korulmeny es tureshatar
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i < tomb.length;i++) {
			System.out.println("Kerem adja meg a meres korulmenyenek leirasat: ");
			String korulmeny = scanner.next();
			//ellenorzott beolvasas:
			int tureshatar;
			do {
			System.out.println("Kerem adja meg a tureshatart(5 vagy 10): ");
			tureshatar= scanner.nextInt();
			}while(tureshatar !=10 && tureshatar != 5);
			
			tomb[i]=new Meres(tureshatar,korulmeny);
			
		}
		
		for(int i=0;i< 10;i++) {
			tomb[0].setEredmeny((Math.random() * (100-2))+1,i);
		}
		
		for(int i=0;i< 10;i++) {
			tomb[1].setEredmeny((Math.random() * (100-2))+1,i);
		}
		//meresek adatainak kiirasa:
		for(Meres valami : tomb) {
			System.out.println(valami);
		}
		
		System.out.println("Legnagyobb elteres az elso Meresnel: "+tomb[0].legnagyobbElteres(15));
		System.out.println("Legnagyobb elteres a masodik Meresnel: "+tomb[1].legnagyobbElteres(15));
		
		System.out.println("Atlagos elteres az elso Meresnel: "+tomb[0].atlagosElteres());
		System.out.println("Atlagos elteres a masodik Meresnel: "+tomb[1].atlagosElteres());
		
		//atlagos elteres tureshataron belul van-e vagy sem?
		
		System.out.println("Az elso minosegellenorzesnek eredmenye: "+tomb[0].tureshataronBelulE());
		System.out.println("A masodik minosegellenorzesnek eredmenye: "+tomb[1].tureshataronBelulE());
		scanner.close();

	}

}
