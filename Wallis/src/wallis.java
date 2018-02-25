import java.util.Arrays;
import java.util.Random;

public class wallis {

	public static void main(String[] args) {
		
			System.out.println("Pi kiszamitasa ketfele modon:");
			double pi = 1;
			for (double i = 1; i < 10000; i++) {
				pi *= ((2 * i / (2 * i - 1) * (2 * i) / (2 * i + 1)));
			}
			System.out.println(pi * 2);
			pi = 0.0;
			for (int i = 0; i < 10000; i++) {
				pi += (Math.pow(-1, i) / (2 * i + 1));
			}
			System.out.println(pi * 4);
			System.out.println("6 faktorialisa ketfele modon kiszamitva:");
			System.out.println(factor(6));
			System.out.println(factor2(6));

			/*
			 * Állítsa elõ az 1 és 100 közé esõ számokból készíthetõ összes számpárt (a
			 * számpárok különbözõ számokból állnak). Számolja meg, hogy ezek közül hány
			 * számpárra igaz, hogy ikerprímek és írja ki ezeket a számpárokat a konzolra.
			 * Megoldás: 8 ilyen számpár van. Az ikerprímek olyan prímszámok, melyek
			 * különbsége 2 (pl. 5 és 7 ikerprímek).
			 */
			System.out.println("isPrime fuggveny kiszamitja ,hogy 15 primszam-e:");
			System.out.println(isPrime(15));
			System.out.println("Ikerprimszamparok eloallitasa:");
			for (int i = 2; i <= 100; i++) {
				for (int j = 2; j <= 100; j++) {
					if (isPrime(i) && isPrime(j) && i + 2 == j) {
						System.out.println("i= " + i + ", j= " + j);
					}
				}

			}
			/*
			 * 5. Gyakorolja a címkézett ciklusok használatát!
			 *  Írja ki a számokat az értéküknek megfelelõ számszor egymás után:
				1
				2 2
				3 3 3
				4 4 4 4
				5 5 5 5 5
			 */
			System.out.println("Szamok kiirasa ertekuknek megfeleloszer:");
			int i=0;
			while (true) {
				if(i==6) {
					break;
				}
				else {
					for (int j = 1; j <= i; j++) {
						System.out.print(i+" ");
					}
					System.out.println();
					i++;
					
				}
				
				
			}
			/*
			 * 4. Deklaráljon és inicializáljon egy 10 elemû int tömböt 
			 * és valósítsa meg az alábbi algoritmusokat külön függvényként:
	    		• lineáris keresés
	    		• közvetlen kiválasztásos rendezés (növekvõ rendezettség minimum kiválasztással)
	    		• bináris keresés
			 */
			System.out.println("Tomb feltoltese random szamokkal:");
			int[] array = {0,0,0,0,0,0,0,0};
			Random rnd= new Random();
			for (i = 0; i < array.length; i++) {
				array[i]=rnd.nextInt(100)+1;
				System.out.println(array[i]);
			}
		
			System.out.println("Megkeresi a 35-ot es megmondja hanyadik a szorszama:");
			System.out.println("Linear Search result :"+linearSearch(35, array));
			System.out.println("Rendezi a tombot novekvo sorrendbe:");
			Arrays.sort(array);
			for (i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}

		}		
		private static int linearSearch(int value, int[] array) {
			for (int i = 0; i < array.length; i++) {
				if(array[i]==value)
					return i+1;
			}
			return -1;
		}

		private static boolean isPrime(int n) {
			for (int i = 2; i < n; i++) {
				if (n % i == 0)
					return false;
			}
			return true;
		}

		private static int factor(int n) {
			int factor = 1;
			for (int i = 1; i <= n; i++) {
				factor *= i;
			}
			return factor;
		}

		private static int factor2(int n) {
			if (n == 1) {
				return 1;
			} else {
				return n * factor2(n - 1);
			}
		}

	}