package PACK.programs;

public class Student2 {
	public Student2(int mark, String b) {
		System.out.println("The name of the student is:" + b);
		System.out.println("obtained mark is:" + mark);
	}

	public Student2(int mark, String b, int mark1) {
		System.out.println("The name of the student is:" + b);
		System.out.println("obtained mark is:" + mark);
		System.out.println("obtained mark1 is:" + mark1);
	}

	public Student2(int mark, String b, int mark1, int mark2) {
		System.out.println("The name of the student is:" + b);
		System.out.println("obtained mark is:" + mark);
		System.out.println("obtained mark1 is:" + mark1);
		System.out.println("obtained mark2 is:" + mark2);
	}

	public static void main(String[] args) {
		Student2 s2;
		s2= new Student2(98, "john");
		s2=new Student2(98,"smith",89);
		s2=new Student2(98,"Reena",89,99);
		

	}

}
