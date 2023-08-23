package practice;

import java.util.Scanner;

public class shashank {
	
	public static void main(String []args)
	
	{
	  Scanner scan= new Scanner (System.in);
	  System.out.println("Enter the name and the age of birth");
	  String name=scan.nextLine();
	  int yob=scan.nextInt();
	  greet(name);
	 
	  
	  int x=age(yob);
	  System.out.println("You are " +x+" years old");
	  
	}
    public static int age(int yob) {
    	yob=2023-yob;
		return yob ;
    	
    	
    	
    }
		// TODO Auto-generated method stub
		
	
	public static void greet(String name) {
    	System.out.println("Hello "+ name + " How are You....?");
	}
	}
    	
		// TODO Auto-generated method stub
		
	