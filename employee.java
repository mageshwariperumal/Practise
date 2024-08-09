package PACK.programs;

public class employee {
	int empid;
	String empname;
	void display() {
		empid=1;
		empname="mage";
		System.out.println("Empid :"+empid+"Empname :"+empname);
		
	}
	public static void main(String[] args) {
		employee obj=new employee();
		obj.display();
	}
}

