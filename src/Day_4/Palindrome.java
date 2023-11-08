package Day_4;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int n,rev=0,r,temp; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n= s.nextInt();
		temp=n;
		while(n>0) {
			r= n%10;
			rev = rev*10+r;
			n=n/10;
		}
//System.out.println("Rev: "+rev);
		if(temp==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		s.close();
	}

}
