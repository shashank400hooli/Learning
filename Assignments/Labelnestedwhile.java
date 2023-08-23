package assignments;

public class Labelnestedwhile {

	public static void main(String[] args) {
		System.out.println("ROBO_________");
		int i=1;
		Shashank:while(i<=10)
		{
			int j=1;
			Piggus:while(j<=10)
			{
				System.out.print("*");
				j++;
				break Shashank;// TODO Auto-generated method stub
			}
			i++;
			System.out.println();
			
		}

	}

}
