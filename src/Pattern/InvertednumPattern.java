package Pattern;

import java.util.Scanner;

public class InvertednumPattern {

	public static void main(String[] args) {// reverse inverted numbers
		int n, sum=0; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n= s.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>=i; j--) {
				sum = j;
				System.out.print(sum);
			}System.out.println();
		}
		System.out.println();
		
		
		
	
	}

}
