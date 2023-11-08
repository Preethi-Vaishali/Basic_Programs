package Number_Methods;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int f1=0, f2=1, f3,num; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num= s.nextInt();
		System.out.print(f1+" "+f2+" ");
		for(int i=2; i<num; i++) {
			f3= f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}
		s.close();

	}

}
