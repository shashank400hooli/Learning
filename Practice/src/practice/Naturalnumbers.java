package practice;

import java.util.Scanner;

public class Naturalnumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scan.nextInt();
		calculateSum(n);// TODO Auto-generated method stub

	}

	public static void calculateSum(int n) {
		{
			int sum = 0;
			for(int i=1;i<=n;i++)
			{
			      sum = sum+i;
			     
			      // TODO Auto-generated method stub
			}
			 System.out.println(sum);
			
		}
		
	}
}

	
