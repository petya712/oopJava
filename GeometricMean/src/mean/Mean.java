package mean;

import java.util.Scanner;

public class Mean {

	public static void main(String[] args) {
		
		int size =10;
		//new empty double array, size = 10
		double[] array = new double[size];
		double mean = 1.0;
		//scanner to read from console
		Scanner scanner = new Scanner(System.in);
		//initializes the  elements of the array from user input
		System.out.println("Insert the members of the array:");
		
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextDouble();
		}
		//prints out the elements of the array, using foreach
		System.out.println("The members of the array:");
		
		for (double d : array) {
			System.out.println(d);
		}
		//calculates the under root part of the mean of the array
		for (double d : array) {
			mean *= d;
		}
		System.out.println("mean:" + mean);
		System.out.println(size + " square root " + mean);
		//calculates and prints the size-th root
		
		System.out.println("Geometric mean:" + Math.pow(mean, 1.0/size));
		scanner.close();
	}

}
