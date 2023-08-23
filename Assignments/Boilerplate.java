package assignments;

import java.util.Scanner;



public class Boilerplate {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		double purchaseamount=scan.nextDouble();
		Purchase purchase=new Purchase();
		
		Purchase.checkDiscount( purchaseamount);// TODO Auto-generated method stub

	}

}
