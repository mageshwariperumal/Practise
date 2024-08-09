package PACK.programs;

public class Arithmetic {
	int a=10;
	int b=20;
	int c;
	void Add() {
		c=a+b;
		System.out.println("The addition of two numbers :"+c);
	}
	void sub() {
		c=a-b;
		System.out.println("The addition of two numbers :"+c);
	}
	void Multiply() {
		c=a*b;
		System.out.println("The addition of two numbers :"+c);
	}
	public static void main(String[] args) {
		Arithmetic obj=new Arithmetic();
		obj.Add();
		obj.sub();
		obj.Multiply();
	}
	

}
