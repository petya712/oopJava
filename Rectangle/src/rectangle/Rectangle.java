package rectangle;

public class Rectangle {

	
		private int a;
		private int b;

		// konstruktor a, b oldallal
		public Rectangle(int a, int b) {
			this.a = a;
			this.b = b;
		}

		// n�gyzet, mindk�t oldal a
		public Rectangle(int a) {
			this(a, a);
		}

		// ter�let
		public int area() {
			return a * b;
		}

		// toString
		public String toString() {
			return "a oldal: " + a + " b oldal: " + b;
		}

		// �rjon setter met�dust, amely be�ll�tja a t�glalap oldalait a param�terk�nt
		// kapott egyetlen �rt�ket adva mindk�t oldalnak
		public void setBoth(int a) {
			this.a = a;
			this.b = a;
			// setBoth(a, a); //ez is m�k�dne
		}

		// �rjon setter met�dust, amely be�ll�tja a t�glalap oldalait a param�terk�nt
		// kapott k�t �rt�kkel.
		public void setBoth(int a, int b) {
			this.a = a;
			this.b = b;
		}

		// �rjon met�dust, amely igazat ad, ha a t�glalap nagyobb ter�let�, mint a
		// param�terk�nt kapott t�glalap, hamisat ad ha nem.
		public boolean isBigger(Rectangle rectangle) {
			return rectangle.area() < area();
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}

		// �rjon met�dust, amely igazat ad, ha a t�glalap oldalai megegyeznek a
		// param�terk�nt kapott t�glalap oldalaival, hamisat ha nem.
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Rectangle other = (Rectangle) obj;
			if (a != other.a)
				return false;
			return b == other.b;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + a;
			result = prime * result + b;
			return result;
		}

	}
