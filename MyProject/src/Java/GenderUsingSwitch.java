package Java;
import java.util.Scanner;

public class GenderUsingSwitch {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("Enter m/f/o for Gender : ");
		char g = i.next().charAt(0);  // using charAt(0) for defining first index(letter) of string.
		
		switch(g)
		{
		case 'm':
			System.out.println("Gender is male.");
			break;
		case 'f':
			System.out.println("Gender is female.");
			break;
		case 'o':
			System.out.println("Gender is other.");
		}
		i.close();

	}

}
