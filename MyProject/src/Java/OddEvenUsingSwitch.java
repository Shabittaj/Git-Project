package Java;
import java.util.Scanner;

public class OddEvenUsingSwitch {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("enter a number: ");
		int a= i.nextInt();
		switch(a%2) //return 0 if it is True
		{
		case 0:
			System.out.println(a+" is even");
			break;
		case 1:
			System.out.println(a+" is odd");
			break;
			
		
		}
		
		i.close();
	}

}
