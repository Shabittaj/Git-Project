package Java;
import java.util.Scanner;

class info{
	public void college() {
		System.out.println("The New College");
	}
	
}

public class JavaBasic {
	static void department() {
		System.out.println("computer science");
	}
	public static void main(String[] args) {
		// This is a Single line comment.
		
		/*
		 * Hello.
		 * This is multi-line comment.
		 */
		
		/**
		 * 
		 * this is a documentation comment.
		 * 
		 */
		int i = 10;
		char c = 'a';
		boolean b = true;
		float f = 29.489f;
		double d = 798.83;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name: ");
		String name= scan.nextLine();
		System.out.println("your name: "+name);
		System.out.println("int : "+i);
		System.out.println("char : "+c);
		System.out.println("boolean : "+b);
		System.out.println("float : "+f);
		System.out.println("double : "+d);
		info obj = new info();
		
		obj.college();
		
		department();
	
		scan.close();
		
	}

}
