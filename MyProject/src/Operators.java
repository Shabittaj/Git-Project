import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = scan.nextInt();
		System.out.println("Enter the second number: ");
		int b = scan.nextInt();
		int sum = a+b;	//assign operator
		int sub = a-b;
		int mul = a*b;
		double div = a/b;
		System.out.println("Addition of two number : "+sum);
		System.out.println("Subtraction of of two number : "+sub);
		System.out.println("Multiplication of two number : "+mul);
		System.out.println("Division of two number : "+div);
		
	
		
	    int increment = ++a;	//Increment
		System.out.println("First number After increment: "+increment);
		int decrement = --b;	//Decrement
		System.out.println("Second number after decrement: "+decrement);
		scan.close();
		
	}

}
