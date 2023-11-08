package Day_3;

public class Increment_Decrement {

	public static void main(String[] args) {
		//declare variables
		int a= 12, b= 12;
		int result1, result2;
		//original value
		System.out.println("Value of a: " +a);
		
		//increment operator
		result1 = ++a;
		System.out.println("After Increment: "+result1);
	
		System.out.println("Value of b: "+b);
		
		//decrement operator
		result2 = --b;
		System.out.println("After Decrement: "+result2);
	}

}
