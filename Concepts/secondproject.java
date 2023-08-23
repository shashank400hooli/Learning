package typecasting;

public class secondproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// float a=3.142//Error as 3.142 is treated as double.
		//float a=(float)3.142;//no error
		float a=3.142f;
		System.out.println(a);
		System.out.println("====================================");
	                     /* below declaration is error the literal 2147483649
	                        of type integer is out of range 
	                      */
		//long d=2147483649//error
		long d=214748364996l;
		System.out.println(d);
		long e=2147483648966l;
		System.out.println(e);
		long f=221;
		System.out.println(f);

	}

}
