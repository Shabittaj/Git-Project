package Java;

public class ArrayIndex {

	public static void main(String[] args) {
		int number[]= {1,9,2,5,4,3};
		int element = 2;	//to find the index of 2
		int index = 0;
		
		for(int i=0;i<number.length;i++) {
			if(number[i]==element) {
				index = i;
				break;
			}
			
		}
		System.out.println("Index of "+ element+" is: "+index);
	}

}
