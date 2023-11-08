package Number_Methods;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num, fact=1; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num= s.nextInt();
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		/*for(int i=num; i>0; i--) {
		fact = fact*i;
	}*/
		System.out.println("The factorial of "+num+" numbers is: "+fact);
s.close();

	}

}
