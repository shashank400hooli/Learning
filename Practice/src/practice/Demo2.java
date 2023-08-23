package practice;

public  class Demo2 {

	public static void main(String[] args) {
		teaBill();
		teaBill("Ginger");
		teaBill("10");
		teaBill("Green",10);
		// TODO Auto-generated method stub 

	}
	public static void teaBill(String type, int n) {
		System.out.println("Bill for" +n+ " " +type+ " tea is "+(n*15));
		// TODO Auto-generated method stub
		
	}
	public static void teabill(int n) {
		System.out.println("Bill for"+n+"tea is"+(n*10)+"Rs");
	}
	

	public static void teaBill(String type) {
		System.out.println("bill for" +type+ "tea is 15 Rs");
		// TODO Auto-generated method stub
		
	}

	public static void teaBill() {
		System.out.println("Bill for tea is 10 Rs");
		// TODO Auto-generated method stub	
	}
	

}
