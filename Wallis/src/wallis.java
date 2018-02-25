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
			 * �ll�tsa el� az 1 �s 100 k�z� es� sz�mokb�l k�sz�thet� �sszes sz�mp�rt (a
			 * sz�mp�rok k�l�nb�z� sz�mokb�l �llnak). Sz�molja meg, hogy ezek k�z�l h�ny
			 * sz�mp�rra igaz, hogy ikerpr�mek �s �rja ki ezeket a sz�mp�rokat a konzolra.
			 * Megold�s: 8 ilyen sz�mp�r van. Az ikerpr�mek olyan pr�msz�mok, melyek
			 * k�l�nbs�ge 2 (pl. 5 �s 7 ikerpr�mek).
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
			 * 5. Gyakorolja a c�mk�zett ciklusok haszn�lat�t!
			 *  �rja ki a sz�mokat az �rt�k�knek megfelel� sz�mszor egym�s ut�n:
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
			 * 4. Deklar�ljon �s inicializ�ljon egy 10 elem� int t�mb�t 
			 * �s val�s�tsa meg az al�bbi algoritmusokat k�l�n f�ggv�nyk�nt:
	    		� line�ris keres�s
	    		� k�zvetlen kiv�laszt�sos rendez�s (n�vekv� rendezetts�g minimum kiv�laszt�ssal)
	    		� bin�ris keres�s
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