package practice;

import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sides");
		int sides=scan.nextInt();
		identifyPolygon( sides) ;
		
				// TODO Auto-generated method stub

	

	
	}

	public static void identifyPolygon(int sides) {
		switch(sides)
		{
		case 3:
		System.out.println("Triangle");// TODO Auto-generated method stub
		break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("Hexagon");
		default :
	
				System.out.println("Polygon");
		}
		
	}

}
