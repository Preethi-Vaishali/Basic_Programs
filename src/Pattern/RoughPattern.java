package Pattern;

import java.util.Scanner;

public class RoughPattern {

	public static void main(String[] args) {
		// reverse inverted numbers
			int n; 
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the number: ");
			n= s.nextInt();
			for(int i=1; i<=n; i++)
			{
				for(int j=1; j<=n; j++) {
					System.out.print("*");
				}System.out.println();
			}
	s.close();}

}
