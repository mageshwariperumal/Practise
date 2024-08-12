package PACK.programs;

public class Exp {
	String name;//instance variable
	static final int stid=9;
	public void disp() {
		int mark=90,mark2=89;//local variable
		int total=mark+mark2;
		System.out.println("The total mark is:"+total);
	}
	public Exp(String n) {
		name=n;
	}
	public void dis() {
		System.out.println("The student name is:"+name);
	}
	public static void main(String[] args) {
		Exp nea=new Exp("john");
		nea.dis();
		System.out.println("The student id is:"+Exp.stid);
		nea.disp();
		
	}
	
	
	

}
