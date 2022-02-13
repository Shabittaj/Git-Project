package Java;

import java.util.Scanner;

public class FindNumberInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = {1,2,3,4,5,6,7};
		System.out.println("Enter an number to find in Array: ");
		int ToFind = s.nextInt();
		boolean found = false;
		for(int n:num) {
			if(n==ToFind) {
				found=true;
				break;
			}
		}
		if(found)
			System.out.println(ToFind+" is Found");
		else
			System.out.println(ToFind+" is not Found");
	}

}
