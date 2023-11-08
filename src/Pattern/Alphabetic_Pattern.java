package Pattern;

import java.util.Scanner;

public class Alphabetic_Pattern {

	public static void main(String[] args) {
		int n, ascii; 
		char ch;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n= s.nextInt();
		for(int i=1; i<=n; i++) {
			ascii = 65;
			ch='A';
			for(int j=1; j<=i;j++) {
				//System.out.printf("%c", ascii);
				System.out.print(ch);
				ch++;
				//ascii++;
				
			}
			System.out.println();
		}
		s.close();
	}

}
