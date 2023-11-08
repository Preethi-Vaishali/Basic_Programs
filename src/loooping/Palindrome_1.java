package loooping;

import java.util.Scanner;

public class Palindrome_1 {

	public static void main(String[] args) {
		int n, r, reverse=0, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = s.nextInt();
		temp = n;
		while(n>0) {
			r= n%10;
			reverse = reverse*10+r;
			n= n/10;

	}
		System.out.println("n =" + temp);
		System.out.println("Reverse =" + reverse);	
		if(temp==reverse)
			System.out.println("The number entered is a Palindrome");
		else
			System.out.println("The number entered is not a Palindrome");
		s.close();
 }
}
