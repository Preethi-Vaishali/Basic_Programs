package loooping;

import java.util.Scanner;

public class Prg_1 {

	public static void main(String[] args) {
		int a,b,c; 
	Scanner s = new Scanner(System.in);
	System.out.print("Enter num1: ");
	a=s.nextInt();
	System.out.print("Enter num2: ");
	b=s.nextInt();
	System.out.print("Enter num3: ");
	c=s.nextInt();
	if(a>b&&a>c)
		System.out.println(a+" is greater than b & c");
	else if(b>c)
		System.out.println(b+" is greater than a & c");
	else
		System.out.println(c+" is greater than b & a");
	}

}
