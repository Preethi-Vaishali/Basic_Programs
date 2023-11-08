package Programs;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1, n2;
		n1 = s.nextInt();
		n2 = s.nextInt();
		int gcd =1;
		for (int i=1; i<=n1 && i<=n2 ; ++i) {
			if(n1%i == 0 && n2 %i ==0) {
				gcd = i;
				
			}
		}
		if(gcd!=1)
			System.out.println("GCD of "+ n1 +" and " +n2+" is "+gcd);
		else
			System.out.println("-1");
		s.close();
	}

}
