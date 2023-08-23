package practice;

import java.util.Scanner;

public class MultipleofTen {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		checkMultipleOfTen(n);
		
	}

	public static void checkMultipleOfTen(int n) {
		 
	
		if(n%10==0)
		{
			System.out.println("Number is the multiple of 10");
		
		// TODO Auto-generated method stub
		
	
	}
		else
		{
			System.out.println("the number is not multiple of 10");
		}

}
}
