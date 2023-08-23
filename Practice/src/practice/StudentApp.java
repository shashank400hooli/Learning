package practice;

public class StudentApp {

	

	public static void main(String[] args ) {
		student s1=new student();
		student s2=new student();
		
		s1.eat();
		s2.study();
		s1.sleep();
		s2.eat();
		
		s2.id=2;
		s2.name="sahana";
		s2.age=23;
		s2.branch="EE";
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.branch);
		
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.branch);
		
		
		// TODO Auto-generated method stub

	}

}
