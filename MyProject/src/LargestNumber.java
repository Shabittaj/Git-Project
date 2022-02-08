import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number: ");
		int a= scan.nextInt();
		System.out.println("enter second number: ");
		int b= scan.nextInt();
		System.out.println("enter third number: ");
		int c= scan.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+" is the largest number");	
		}
		else if(c>a && c>b)
		{
			System.out.println(c+" is the largest number");
		}
		else 
		{
			System.out.println(b+" is the largest number");
		}
		
	
	
	}

}
