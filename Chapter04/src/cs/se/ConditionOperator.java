package cs.se;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionOperator {

	public static void main(String[] args) {
		String result = "";
		int num;
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		try {
			System.out.print("Enter Integer Number: ");
			num = Integer.parseInt(br.readLine());
			
			result = (num%2 == 0) ? "Even Number" : "Odd Number";
			
			System.out.println(num + " is " + result);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
