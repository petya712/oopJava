package rectangle;

public class Main {

	public static void main(String[] args) {
		// Hozzon l�tre k�t t�glalap objektumot ("a" �s "b"), �s deklar�ljon egy
				// harmadik referencia v�ltoz�t ("c"), amely �rt�k�l "a"-t veszi fel.
				
				Rectangle firstRectangle = new Rectangle(86, 42);
				Rectangle secondRectangle = new Rectangle(17);
				
				Rectangle thirdRectangle = firstRectangle;
				
				//�rja ki mindh�rom referencia v�ltoz� eset�n a String-be �sszef�z�tt adatokat.
				System.out.println("1: "+firstRectangle);
				System.out.println("2: "+secondRectangle);
				System.out.println("3: "+thirdRectangle);
				System.out.println();
				firstRectangle.setBoth(56,60);
				System.out.println("1: "+firstRectangle);
				secondRectangle.setBoth(20);
				System.out.println("2: "+secondRectangle);
				System.out.println("3: "+thirdRectangle);
				
				//isBigger met�dus szeml�ltet�se:
				
				System.out.print("The first rectangle is bigger than the second? ");
				 if(firstRectangle.isBigger(secondRectangle)) {
					 System.out.println("-true");
				 }else {
					 System.out.println("-false");
				 }
				 
				 //equals met�dus szeml�ltet�se:
				 
				 System.out.print("The first and the second rectangle are: ");
				 if(firstRectangle.equals(secondRectangle)) {
					 System.out.println("equal");
				 }else {
					 System.out.println("not equal");
				 }
				 
				 //hashCode szeml�ltet�se:
				 System.out.println("");
				 System.out.println("First rectangle's hash code:" + firstRectangle.hashCode());
				 System.out.println("Second rectangle's hash code:" + secondRectangle.hashCode());
				 System.out.println("Third rectangle's hash code:" + thirdRectangle.hashCode());
	}

}
