package practice;

import java.util.Scanner;

public class VendingMachine {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Productcode");
		String productcode=scan.next();
		getProduct(productcode);// TODO Auto-generated method stub

	}

	public static void getProduct(String productcode) {
		switch(productcode){
		case "P01":
			System.out.println("CocaCola");// TODO Auto-generated method stub
		break;
		case "P02":
			System.out.println("Pepsi"); 
			break;
		case "P03":
			System.out.println("Fanta");
			break;
		case "P04":
			System.out.println("Jaljeera");
			break;
		case "P05":
			System.out.println("MountainDew");
			break;
		case"P06":
			System.out.println("BoatGuava");
			break;
	    default:
				System.out.println("Panaka");
			
		
		
	}

}
}