package Recursion;

import java.util.Scanner;

public class RecursionPrimenumber {
	static int number =2, count;
	static int isprime(int num) {
		for(int j=2; j<=num/2; j++) {
			if(num%j==0) {
				num++;
				isprime(num);
			}
		}
		if(count ==0) {
			System.out.print(num+" ");
			count++;
		}
		return num;
	}
	static void primenumber(int n) {//primenumber=10
		count = 0;
		if(n==0)
			return;
		else {
			if(number==2) {
				System.out.print(number+" ");
				number++;
			}
			else {
				number = isprime(number);
				number++;
			}
		}
		primenumber(--n);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		primenumber(n1);
		s.close();
		

	}

}
