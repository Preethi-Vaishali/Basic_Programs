package loooping;

import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
	int n;
	Scanner s= new Scanner(System.in);
	System.out.print("Enter the number:");
	n = s.nextInt();
	if(n%2==0)
		System.out.print("The Given number "+n+" is even");
	else
		System.out.print("The Given number "+n+" is odd");
	s.close();

	}

}
