package Pattern;

import java.util.Scanner;

public class Number_Patter {

	public static void main(String[] args) {
		int n, sum=0; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n= s.nextInt();
		//wrong code
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>=i; j--) {
				sum = i;
				System.out.print(sum);
			}System.out.println();
		}
		System.out.println();
		
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++) {
				sum = i;
				System.out.print(sum);
			}System.out.println();	
		}
		System.out.println();
		
			
			for(int i=n; i>=1; i--)
			{
				for(int j=n; j>=i; j--) {
					
					System.out.print(j);
					
				}System.out.println();
			}System.out.println();
			
			
				for(int i=1; i<=n; i++)
				{for(int j=n; j>=i; j--) {
						sum = j;
						System.out.print(sum);
					}System.out.println();
				}System.out.println();
		s.close();
	}
	}

