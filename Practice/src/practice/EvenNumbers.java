package practice;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		printEvenNumbers(n);// TODO Auto-generated method stub

	}

	public static void printEvenNumbers(int n) {
		for(int i=1;i<=n;i++)
		{
			if(i%2<=0)
			{
				System.out.print(" "+i+" ");// TODO Auto-generated method stub
			}
		}
		
	}

}
