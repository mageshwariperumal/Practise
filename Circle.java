package PACK.programs;

public class Circle {
	private int radius;
	private String color;
	
	public Circle(int radius,String color){
		this.radius=radius;
		this.color=color;
	}
	public void display() {
		System.out.println("Radius ="+radius+",color ="+color);
	}
	public static void main(String[] args) {
		Circle obj=new Circle(1,"red");
		obj.display();
	}

}
