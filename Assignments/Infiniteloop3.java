package assignments;

public class Infiniteloop3 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			for(;;)
			{
				System.out.println("Kodnest");
				break;// TODO Auto-generated method stub
			}
			
		}

	}

}
