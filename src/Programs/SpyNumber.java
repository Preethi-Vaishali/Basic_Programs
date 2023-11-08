package Programs;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Please Enter Number to Check Spy Num = ");
		int n= s.nextInt();
		int mul=1,sum=0, rem=0; 
		int num = n;
		while(num>0) {
			rem = num%10;
			sum = sum+rem;
			mul = rem*mul;
		    num= num/10;
			}
		//System.out.println(mul);
		//System.out.println(sum);
			if (sum == mul) 
			{
				System.out.println(n +  " is a Spy Number");
			}
			else 
			{
				System.out.println(n +  " is Not a Spy Number");
			}
		s.close();

	}

}
