package Java;

import java.util.Scanner;

public class Array{
	public static void main(String[] args) {
		int n, sum = 0;
		float average;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of element you want in array:");
		n = scan.nextInt();
		int a[]= new int[n];
		System.out.println("enter the number: ");
		for(int i=0; i<n;i++)
		{
			a[i]=scan.nextInt();
			sum+=a[i];
			
		}
		System.out.println("sum: "+sum);
		average = (float)sum/n;
		System.out.println("Average:"+average);
	}
}