package loooping;

import java.util.Scanner;

public class Sum0fNatural {

	public static void main(String[] args) {
		int n,sum=0; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of natural nos: ");
		n= s.nextInt();
		for(int i=1; i<=n; i++) {
			sum +=i;
		}
		System.out.println("The sum of "+n+" Natural Numbers is: " +sum);
	s.close();

}}
