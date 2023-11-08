package Programs;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n= s.nextInt();
		int count =0; 
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				System.out.println(n+ " is not a prime");
				count++;
				break;
			}
		}
		if(count==0 && n!=1)
			System.out.print(n+ " is a Prime number");
		s.close();
	}

}
