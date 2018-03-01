package my.first;

public class Util {

	public static void calculate(String operator,Double firstNumber, Double secondNumber) {
		System.out.print("Result: ");
		//switch case depending on the operator
		//syso-s the result
		switch (operator){
		case "-":
			System.out.println(firstNumber - secondNumber);
			break;
		case "+":
			System.out.println(firstNumber + secondNumber);
			break;
		case "/":
			//check whether or not the second number is 0 ,because you cannot divide with 0
			if(!secondNumber.equals(0.0))
				System.out.println(firstNumber / secondNumber);
			else
				System.out.println("Cannot divide with 0");
			break;
		case "*":
			System.out.println(firstNumber * secondNumber);
			break;
		default:
			System.out.println("Unknown operator!");
			break;
		}

	}

}
