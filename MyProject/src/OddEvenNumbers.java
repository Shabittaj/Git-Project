import java.util.Scanner;

public class OddEvenNumbers {
	public static void main(String[] args) {
		Scanner i= new Scanner(System.in);
		System.out.println("enter a number : " );
		int a= i.nextInt();
		if(a%2==0)
		{
			System.out.println(a+" is even");
		}
		else
		{
			System.out.println(a+" is odd");
		}
	}
}
