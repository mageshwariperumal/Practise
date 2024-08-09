package PACK.programs;

public class Student {
	private String name;
	private double rolno;
	private int marks;
	
	public Student(String name,double rolno,int marks) {
		this.name=name;
		this.rolno=rolno;
		this.marks=marks;
	}
		public void display()
		{
			System.out.println("The name of the person is "+name+", rollno is "+rolno+"and obtained marks is:"+marks);
		}
	public static void main(String[] args) {
		Student obj=new Student("mage",300002020200L,98);
		obj.display();
	}

}
