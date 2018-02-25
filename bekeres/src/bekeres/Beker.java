package bekeres;
import java.util.Scanner;
public class Beker {

	public static void main(String[] args) {
		Scanner szemek = new Scanner(System.in);
		System.out.println("Irj be egy szamot:");
		double szam1= szemek.nextDouble();
		System.out.println("Irj be egy masik szamot:");
		int szam2= szemek.nextInt();
		System.out.println("A ket szam osszege:"+(szam1+szam2));
		szemek.close();		

	}

}
