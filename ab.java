package PACK.programs;

abstract class Animal {
	abstract void sound();
}
class lion extends Animal{
	void sound() {
		System.out.println("The is lion grunt");
	}
}
class Tiger extends Animal{
	void sound() {
		System.out.println("The is tiger growl");
	}
}
public class ab{
public static void main(String[] args) {
	Animal a=new lion();
	a.sound();
	Animal b=new Tiger();
	b.sound();
}
}

