package tartalyos.fut;


import java.util.Scanner;

import tartalyos.Tartaly;

public class Proba {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Tartaly[] tartalyTomb = new Tartaly[5];
		for (int i = 0; i < tartalyTomb.length; i++) {
			tartalyTomb[i]= new Tartaly(scanner.nextInt(), scanner.nextDouble());
		}
		for (Tartaly tartaly : tartalyTomb) {
			System.out.println(tartaly);
		}
		
		Tartaly maxTartalyNyomas = tartalyTomb[0];
		for (int i = 1; i < tartalyTomb.length; i++) {
			if (!maxTartalyNyomas.nagyobbNyomasu(tartalyTomb[i])) {
				maxTartalyNyomas = tartalyTomb[i];
			}
		}
		System.out.println("legnagyobb nyomasu tartaly"+ maxTartalyNyomas);
		
		Tartaly maxTartalyTerfogat = Tartaly.nagyobb(tartalyTomb[0], tartalyTomb[1]);
		for (int i = 2; i < tartalyTomb.length; i++) {
			maxTartalyTerfogat=Tartaly.nagyobb(maxTartalyTerfogat, tartalyTomb[i]);
		}
		System.out.println("legnagyobb terfogatu tartaly"+ maxTartalyTerfogat);
	}

}