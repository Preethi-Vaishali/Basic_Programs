package Arrays;

import java.util.Scanner;

public class File2 {

	public static void main(String[] args) {
		int n, rev=0, r,temp,n1=0; 
		Scanner s = new Scanner(System.in);
		//System.out.print("Enter the number: ");
		n= s.nextInt();
		temp=n;
		
		while(n>0) {//while(n!=0)
			r= n%10;
			r +=1;
			rev = rev*10+r; //rev = rev*10+(++r);
			n=n/10;
		}
		while(rev>0) {//while(rev!=0)
			r= rev%10;
			System.out.print(r);//n1 = n1*10+r;
			rev=rev/10;
		}
	//	System.out.println("N= "+temp);
	//	System.out.println("Result= "+n1);
		s.close();
	}
/*test case1: 
	IP:4567
	OP: 5678
		
  test case2: 
	IP: 1023
	OP: 2134*/
}
