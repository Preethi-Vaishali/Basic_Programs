package Programs;

import java.util.Scanner;

public class Prime_nums_between_Range {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the minimum number: ");
		int min= s.nextInt();
		System.out.print("Enter the maximum number: ");
		int max= s.nextInt();
		System.out.print("The Prime nums are: ");
		for(int n =min; n<=max; n++) {
		int count =0;
		
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				count++;
				break;
				
			}
		}
		if(count==0 && n!=1)
			System.out.print(n+" ");
		}
		s.close();

	}

}
