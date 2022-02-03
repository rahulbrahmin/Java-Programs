package chegg;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		System.out.println("\t\t\t\tCalculator\n\n");
		Calculator calc = new Calculator(); 
		
		Scanner input = new Scanner(System.in);              // create an object of Scanner class
		
		//Ask user to input numbers
		System.out.print("Enter first number:  ");
		Double number1 = input.nextDouble();
		
		System.out.print("Enter second number:  ");
		Double number2 = input.nextDouble();
		Double result;
		Boolean result1;
		
		//ask user to input operator
		System.out.println("Choose a number describing the operation\n"
				+ "1. Addition,\n2. Subtraction,\n3. Multiply,\n"
				+"4. Divide,\n5. Average,\n6. Modulus,\n"
				+ "7. Logical AND,\n8. Logical OR\n");
		
		int x = input.nextInt();
		System.out.println();
		
		// Using switch to make code more clean and easy to understand, You can also use if else here
		switch(x) {
		case 1:{
			result = calc.add(number1 , number2);                 // performs addition between two numbers.
			System.out.println(number1 +" + " + number2
					+ " = " + result);
			break;
		}	
		case 2:{
			result = calc.subtract(number1 , number2);           // performs subtraction between two numbers. 
			System.out.println(number1 +" - " + number2
					+ " = " + result);
			break;
		}	
		case 3:{
			result = calc.multiply(number1 , number2);           // performs multiplication between two numbers.
			System.out.println(number1 +" * " + number2
					+ " = " + result);
			break;
		}
		case 4:{
			result = calc.divide(number1 , number2);             // performs division between two numbers.
			System.out.println(number1 +" / " + number2
					+ " = " + result);	
			break;
		}	
		case 5:{
			result = calc.avg(number1 , number2);               // Calculates average of two numbers.
			System.out.println("Average of " + number1 +" and " + number2
					+ " = " + result);	
			break;
		}	
		case 6:{
			result = calc.mod(number1 , number2);               // performs Modulus between two numbers.
			System.out.println("Modulus of " + number1 +" and " + number2
					+ " = " + result);
			break;
		}
		case 7:{
			result1 = calc.logicAnd(number1 , number2);         // Calculates Logical And of two numbers.
			System.out.println("Logic And of " + number1 +">" + number2
					+ " and " + number2 + ">0 is " + result1);
			break;
		}	
		case 8:{
			result1 = calc.logicOr(number1 , number2);         // Calculates Logical Or of two numbers.
			System.out.println("Logic Or of " + number1 +">" + number2
					+ " and " + number2 + ">0 is " + result1);
			break;
		}
		default:
			System.out.println("Invalid Operator!");
		
		}
		
	}

}
