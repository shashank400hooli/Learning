package practice;

import java.util.Scanner;

public class Arithematic1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(substractNumbers(num1,num2));
		
		System.out.println("Enter 2 numbers");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
		System.out.println(multiplyNumbers(num1,num2));
		
		System.out.println("Enter 2 numbers");
		 num1=scan.nextInt();
		 num2=scan.nextInt(); 
		System.out.println(divideNumbers(num1,num2));
		
		System.out.println("Enter 2 numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println(remainderNumber(num1,num2));
	}

	public static int remainderNumber(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1%num2;
	}

	public static int divideNumbers(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}

	public static int multiplyNumbers(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	public static int substractNumbers(int num1, int num2) {
		// TODO Auto-generated method stub
		return num2-num1;
	}
	
	
		
		
		
		
		// TODO Auto-generated method stub

	}


