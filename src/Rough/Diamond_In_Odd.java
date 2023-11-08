package Rough;

import java.util.Scanner;

public class Diamond_In_Odd {

	public static void main(String[] args) {
		int n; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n= s.nextInt();
		System.out.print("Enter Symbol : ");
		char c = s.next().charAt(0);
		 
		for(int i=1;i<=n;i++)
		{
		for(int space=1;space<=n-i;space++)
		 
		{
		System.out.print(" ");
		}
		 
		for(int j=1;j<=i*2-1;j++)
		 
		{
		System.out.print(c);
		}
		System.out.println();
		 
		} 
		for(int i=n-1;i>0;i--)
		{
		for(int space=1;space<=n-i;space++)
		 
		{
		System.out.print(" ");
		}
		for(int j=1;j<=i*2-1;j++)
		 
		{
		System.out.print(c);
		}
		System.out.println();
		}
		s.close(); 		
	}
		

}
