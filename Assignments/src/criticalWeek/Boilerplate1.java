package criticalWeek;

import java.util.Scanner;

import assignments.Check;

public class Boilerplate1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Grade");
		int grade=scan.nextInt();
		Check1 check1=new Check1();
		Check1.checkgrade1(grade);// TODO Auto-generated method stub

	}

	public static void checkgrade(int grade) {
		if(grade>50)
		{
			System.out.println("Pass");// TODO Auto-generated method stub
		}
		else
		{
			System.out.println("Fail");
		}
		// TODO Auto-generated method stub

	}

}
