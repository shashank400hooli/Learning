package assignments;

public class Infinteloop7 {

	public static void main(String[] args) {
		do
		{
			System.out.println("Hello");
			for(int i=1;i<100;i=i+3)
			{
				System.out.println("Kodnest");
				if(i==19)
				{
					break;// TODO Auto-generated method stub
				}
			}
			System.out.println("Technologies");
			break;
		}while(true);

	}

}
