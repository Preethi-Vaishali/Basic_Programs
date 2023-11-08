package Programs;

import java.util.Scanner;

public class Abundant_Number {

	public static void main(String[] args) {
		int sum=0;
			Scanner s = new Scanner(System.in);
			//System.out.print("Enter the number: ");
			int n = s.nextInt(); 
			for(int i=1; i<=n/2; i++) {
				if(n%i==0) {
					sum +=i;
					}
				}//System.out.println(sum);
			if(sum > n)
				System.out.print("Abundant Number");
			else
				System.out.print("Not an Abundant number");
				
			s.close();	
}

}
