package cs.se;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

	public static void main(String[] args) {
		float num1, num2, result;
		int choice;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
				
		try {
			System.out.println("+++++++++++++Calculator Application+++++++++++");
			System.out.println("1. Addition (+)");
			System.out.println("2. Subtraction (-)");
			System.out.println("3. Multiplication (*)");
			System.out.println("4. Division (/)");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			
			System.out.print("Select Choice : ");
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1: System.out.println("Addition");
					System.out.print("Enter first number : ");
					num1 = Float.parseFloat(br.readLine());
					System.out.print("Enter second number : ");
					num2 = Float.parseFloat(br.readLine());
					result = num1+num2;
					System.out.println(String.format("%.0f", num1) + " + " + num2 + " = " + result);
					
				break;
			case 2: System.out.println("Subtraction");
					System.out.print("Enter first number : ");
					num1 = Float.parseFloat(br.readLine());
					System.out.print("Enter second number : ");
					num2 = Float.parseFloat(br.readLine());
					result = num1-num2;
					System.out.println(num1 + " - " + num2 + " = " + result);
				break;
			case 3: System.out.println("Multiplication");
					System.out.print("Enter first number : ");
					num1 = Float.parseFloat(br.readLine());
					System.out.print("Enter second number : ");
					num2 = Float.parseFloat(br.readLine());
					result = num1*num2;
					System.out.println(num1 + " * " + num2 + " = " + result);
				break;
			case 4: System.out.println("Division");
					System.out.print("Enter first number : ");
					num1 = Float.parseFloat(br.readLine());
					System.out.print("Enter second number : ");
					num2 = Float.parseFloat(br.readLine());
					result = num1/num2;
					System.out.println(num1 + " / " + num2 + " = " + result);
				break;
			default: System.out.println("Out of menu!");
				break;
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
