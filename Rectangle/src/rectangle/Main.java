package rectangle;

public class Main {

	public static void main(String[] args) {
		// Hozzon létre két téglalap objektumot ("a" és "b"), és deklaráljon egy
				// harmadik referencia változót ("c"), amely értékül "a"-t veszi fel.
				
				Rectangle firstRectangle = new Rectangle(86, 42);
				Rectangle secondRectangle = new Rectangle(17);
				
				Rectangle thirdRectangle = firstRectangle;
				
				//Írja ki mindhárom referencia változó esetén a String-be összefûzött adatokat.
				System.out.println("1: "+firstRectangle);
				System.out.println("2: "+secondRectangle);
				System.out.println("3: "+thirdRectangle);
				System.out.println();
				firstRectangle.setBoth(56,60);
				System.out.println("1: "+firstRectangle);
				secondRectangle.setBoth(20);
				System.out.println("2: "+secondRectangle);
				System.out.println("3: "+thirdRectangle);
				
				//isBigger metódus szemléltetése:
				
				System.out.print("The first rectangle is bigger than the second? ");
				 if(firstRectangle.isBigger(secondRectangle)) {
					 System.out.println("-true");
				 }else {
					 System.out.println("-false");
				 }
				 
				 //equals metódus szemléltetése:
				 
				 System.out.print("The first and the second rectangle are: ");
				 if(firstRectangle.equals(secondRectangle)) {
					 System.out.println("equal");
				 }else {
					 System.out.println("not equal");
				 }
				 
				 //hashCode szemléltetése:
				 System.out.println("");
				 System.out.println("First rectangle's hash code:" + firstRectangle.hashCode());
				 System.out.println("Second rectangle's hash code:" + secondRectangle.hashCode());
				 System.out.println("Third rectangle's hash code:" + thirdRectangle.hashCode());
	}

}
