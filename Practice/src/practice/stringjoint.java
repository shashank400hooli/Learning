package practice;

import java.util.Scanner;

public class stringjoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your First and Last name");
		String firstName=scan.next();
		String lastName=scan.next();
		System.out.println(joinStrings(firstName,lastName));
	}

	public static String joinStrings(String str1, String str2) {
		// TODO Auto-generated method stub
		return str1+str2;
	
		
		

	}

}
