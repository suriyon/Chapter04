package cs.se;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exams {

	public static void main(String[] args) {
		String stdName, result = "";
		int score;
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
				
		try {
			System.out.print("Enter Student Name: ");
			stdName = br.readLine();
			System.out.print("Enter Score: ");
			score = Integer.parseInt(br.readLine());
			
			if(score<60) {
				result = "Not Pass";
			}
			if(score>=60) {
				result = "Pass";
			}
			
			System.out.println("Student Name: " + stdName);
			System.out.println("Student Score: " + score);
			System.out.println("Result: " + result);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
