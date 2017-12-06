package cs.se;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddNumber {

	public static void main(String[] args) {
		int num;
		String result = "";
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
				
		try {
			System.out.print("Enter Integer Number: ");
			num = Integer.parseInt(br.readLine());
			
			if(num%2 == 0) {
				result = "Even Number";
			}else {
				result = "Odd Number";
			}
			
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
