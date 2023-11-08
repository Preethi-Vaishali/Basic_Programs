package Arrays;

import java.util.Scanner;

public class Calculator_Prg {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
		int n1,n2,n; 
		System.out.println("");
		System.out.println("Enter the two numbers to perform operations ");
		
		System.out.print("Enter the first number : ");
		n1= s.nextInt();
		System.out.print("Enter the second number : ");
		n2= s.nextInt();
		System.out.println("Choose the operation you want to perform ");
		System.out.println("Choose 1 for ADDITION");
		System.out.println("Choose 2 for SUBRACTION");
		System.out.println("Choose 3 for MULTIPLICATION");
		System.out.println("Choose 4 for DIVISION");
		System.out.println("Choose 5 for MODULUS");
		System.out.println("Choose 6 for EXIT");
		n=s.nextInt();
		switch(n) 
		{
		case 1:
			System.out.print("Result : "+ (n1+n2));
			break;
		case 2:
			System.out.print("Result : "+ (n1-n2));
			break;
		case 3:
			System.out.print("Result : "+ (n1*n2));
			break;
		case 4:
			System.out.print("Result : "+ (n1/n2));
			break;
		case 5:
			System.out.print("Result : "+ (n1%n2));
			break;
		case 6:
			System.exit(0);
			break;
		}
		}
		
}}
