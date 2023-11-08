package Assessment_1;

import java.util.Scanner;

public class Decendingnumber_pattern {

	public static void main(String[] args) {
		int n; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n= s.nextInt();
		
		for(int i=n; i>=1; i--)
			
		{
			for(int j=n; j>=i; j--) {
				
				System.out.print(j+" ");
			}System.out.println();

	}
s.close();
}
	
}
