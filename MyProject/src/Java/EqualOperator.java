package Java;
import java.util.Scanner;

public class EqualOperator {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a: ");
		int a = scan.nextInt();
		System.out.println("enter b: ");
		int b = scan.nextInt();
		if(a==b) {
			System.out.println("both are equal");
		}
		if(a!=b) {
			System.out.println("both are not equal");
		}
		scan.close();
	}
}
