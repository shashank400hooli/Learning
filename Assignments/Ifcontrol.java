package assignments;

import java.util.Scanner;

public class Ifcontrol {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int marks=scan.nextInt();
		System.out.println("Welcome to Kodnest");
		Check check=new Check();
		check.elgibility(marks);// TODO Auto-generated method stub

	}

}
