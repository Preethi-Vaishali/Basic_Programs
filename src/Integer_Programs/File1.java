package Integer_Programs;

public class File1 {

	public static void main(String[] args) {
		int a,b,add; //variable declaration
		a= 10; //variable initialization
		b = 20;
		//a and b are called as identifiers - variable identifier
		System.out.println(a+b);//10+20 = 30 //addition
		System.out.println(a-b); //subraction
		System.out.println(a*b); //Multiplication
		System.out.println(a/b); //Division
		
		System.out.println("\nAddition= "+ (a+b));
		System.out.println("Subraction= "+ (a-b)); 
		System.out.println("Multiplication= "+(a*b)); 
		System.out.println("Division= "+(a/b));
		
		System.out.println("\nOne way of printing:");
		System.out.println("Addition= "+(a+b)
				          +", Subraction= "+(a-b)
				          +", Multiplication= "+(a*b)
				          +", Division= "+(a/b)+".");
		
		System.out.println("\nAnother way of printing:");
		System.out.println("Addition = "+(a+b)
				          +", \nSubraction = "+(a-b)
				          +", \nMultiplication = "+(a*b)
				          +", \nDivision = "+(a/b)+".");
		
		
		//add = a+b;
		//System.out.println(add);
		//System.out.println("The Sum of two numbers is: " + add);
		
		/*Output:
		 * Addition = 30
		 * Subraction = -10
		 * Multiplication = 200
		 * Division = 0
		 */

	}

}
