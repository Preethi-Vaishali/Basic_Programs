package Programs;

import java.util.Scanner;

public class Peterson_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Please Enter Number to Check Peterson Num = ");
		int n= s.nextInt();
		int fact=0,sum=0, rem=0; 
		for(int i = n; i > 0; ) {
			fact =1;
			rem = i%10;
			i = i/10;
			for(int j =1; j<= rem; j++) {
				fact = fact*j;
				
			}sum= sum+fact;
		}
			if (sum == n) 
			{
				System.out.println(n +  " is a Peterson Number");
			}
			else 
			{
				System.out.println(n +  " is Not a Peterson Number");
			}
		s.close();	
	}
}


