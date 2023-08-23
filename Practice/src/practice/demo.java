package practice;

public class demo {

	public static void main(String[] args) {
		greet();
		int x=20;
		int y=10;
		int res=multi(x,y);
		System.out.println("Multiplication Result "+res);
		int res1=add(x,y);
		System.out.println("Addition Result"+res1);
		boolean res2=checkGreater(x,y);
		System.out.println(res2);
		int res3=add(x,y)/2;
		System.out.println("Average is "+res3);
		
		// TODO Auto-generated method stub

	}

	public static  boolean checkGreater( int x, int y) {
		// TODO Auto-generated method stub
		return x>y;
	}

	public static int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	public static int multi(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	public static void greet() {
		System.out.println("Hello World...");
		// TODO Auto-generated method stub
		
	}

}
