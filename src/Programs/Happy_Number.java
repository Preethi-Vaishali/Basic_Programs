package Programs;

import java.util.Scanner;

public class Happy_Number {
	static void happyNum(int n) {
		int r=0, t=0;
		int num=n;
		while(num>0) {
			r = num%10;
			t = (r*r)+t;
			num= num/10;	
		}//System.out.println(t);
		num=t;
		if(num<10) {
		if(num==1)
			System.out.println("Happy Number");
		else
			System.out.println("Not a Happy Number");
	}
	else
		happyNum(num);
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Please Enter no. = ");
		int n = s.nextInt();
		happyNum(n);
s.close();
	}

}
