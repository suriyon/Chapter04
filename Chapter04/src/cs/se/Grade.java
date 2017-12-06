package cs.se;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grade {

	public static void main(String[] args) {
		int score;
		String grade = "";
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
				
		try {
			System.out.print("Enter your score: ");
			score = Integer.parseInt(br.readLine());
			
			if(score<0 || score>100) {
				grade = "Score not in range";
			}else if(score<50) {
				grade = "Grade F";
			}else if(score<60) {
				grade = "Grade D";
			}else if(score<70) {
				grade = "Grade C";
			}else if(score<80) {
				grade = "Grade B";
			}else {
				grade = "Grade A";
			}
			
			System.out.println("Result: " + grade);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
