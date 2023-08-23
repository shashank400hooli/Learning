package assignments;

public class Infiniteloop4 {

	public static void main(String[] args) {
		for(;;)
		{
			System.out.println("Hello");
			for(;;)
			{
				System.out.println("kodnest");
				break;// TODO Auto-generated method stub
			}
			System.out.println("Technologies");
			break;
		}

	}

}
