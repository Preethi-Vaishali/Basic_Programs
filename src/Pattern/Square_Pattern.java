package Pattern;

import java.util.Scanner;

public class Square_Pattern {

	public static void main(String[] args) {
		int n; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n= s.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++) {
				if (i==1 || i==n || j==1 || j==n)
					System.out.print("*");
				else
					System.out.print(" ");
					
			}
			System.out.println();
	}
s.close();
}}
