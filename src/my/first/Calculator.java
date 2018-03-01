package my.first;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		String calculation;
		Double firstNumber;
		Double secondNumber;
		String operator;
		while(true){
			calculation = scanner.nextLine();
			firstNumber = Double.parseDouble(calculation.split(" ")[0]);
			secondNumber = Double.parseDouble(calculation.split(" ")[2]);
			operator = calculation.split(" ")[1];
			Util.calculate(operator, firstNumber, secondNumber);
		}

	}

}
