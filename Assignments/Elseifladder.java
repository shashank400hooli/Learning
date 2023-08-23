package assignments;

import java.util.Scanner;

public class Elseifladder {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the score");
		int score=scan.nextInt();
		Score s1=new Score();
		s1.checkscore(score);
	
	}

}
