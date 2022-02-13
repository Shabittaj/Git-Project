package Java;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Logical AND operator
		System.out.println((5>3) && (8>5)); //Return true 
		System.out.println((5>3) && (8<5)); //Return false 
		
		// Logical OR operator
		System.out.println((5<3) || (8>5)); //Return True 
		System.out.println((5>3) || (8<5)); //Return True 
		System.out.println((5<3) && (8<5)); //Return false
		
		// ! operator
		System.out.println(!(5==3)); //Return true
		System.out.println(!(5>3)); //Return false
		
	
	
	}

}
