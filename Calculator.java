package PACK.programs;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		int output=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value for a:");
	int a=sc.nextInt();
	System.out.println("Enter the value for b:");
	int b=sc.nextInt();
	System.out.println("Enter the Choice like +,-,*,/:");
	char choice=sc.next().charAt(0);
	switch(choice) {
	case '+':
		output=a+b;
		break;
	case '-':
		output=a-b;
		break;
	case '*':
		output=a*b;
		break;
	case '/':
		output=a/b;
		break;
	default:
		output=0;
	}
	System.out.println("The value a is "+a+" and b is "+b+"="+output);
	
	}
	

}
