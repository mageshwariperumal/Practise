package PACK.programs;

public class Std {
	
	void add(int a,int b) {
		int c=a+b;
		System.out.println("The added value is:"+c);
	}
	void add(double a, double b) {
		double c=a+b;
		System.out.println("The added value is:"+c);
	}
	public static void main(String[] args ) {
		Std d= new Std();
		d.add(98,89);
		d.add(987878696,789645468);
	}

}
