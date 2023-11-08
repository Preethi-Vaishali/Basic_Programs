package Programs;

import java.util.Scanner;

public class Tech_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");//153, 370, 371, 407, 1634, 1, 2, 3
		int n= s.nextInt();
		int result; 
		String str1= String.valueOf(n);
		//int len = str.length();
		//System.out.println(Math.pow(2, 3));
			if(str1.length()==4){
		//if(n>999 && n<=9999){
				result=(int)Math.pow(((n/100)+(n%100)),2);
				if(n==result)
					System.out.println(n+ " is a Tech number");
				else 
					System.out.println(n+ " is not a Tech number");
			}
			else
				System.out.println("Not a valid number");
				s.close();
			}
}	
	
