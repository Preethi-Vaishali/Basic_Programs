package loooping;

import java.util.Scanner;

public class Summing {

	public static void main(String[] args) {
		int n, r, sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = s.nextInt();
		while(n>0) {
			r= n%10;
			sum = sum+r;
			n= n/10;
		}
		System.out.println("Sum of the digits: " +sum);
		s.close();
}
}