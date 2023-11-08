package Assessment_1;

import java.util.Scanner;

public class Slanting_Gapped_Square {

	public static void main(String[] args) {
		int n; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n= s.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int space=1; space<i; space++) 
			{
				System.out.print(" ");
			 
			}
			for(int j=1; j<=n; j++) {
				if (i==1 || i==n || j==1 || j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
		}System.out.println();
		
		for(int i=1; i<=n; i++)
		{
			for(int space=n; space>i; space--) 
			{
				System.out.print(" ");
			 
			}
			for(int j=1; j<=n; j++) {
				if (i==1 || i==n || j==1 || j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
		}System.out.println();
			s.close();}
		
		}



