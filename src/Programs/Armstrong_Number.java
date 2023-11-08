package Programs;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");//153, 370, 371, 407, 1634, 1, 2, 3
		int n= s.nextInt();
		int sum=0,r,temp=n; 
		String str= String.valueOf(n);
		int len = str.length();
		//System.out.println(Math.pow(2, 3));
		while(n>0) {
			r = n%10;
			sum=(int)(sum+Math.pow(r, len));
			n=n/10;
		}
		if(temp==sum)
			System.out.println(temp+ " is an Armstrong number");
		else
			System.out.println(temp+ " is not an Armstrong number");
		s.close();
	}

}
