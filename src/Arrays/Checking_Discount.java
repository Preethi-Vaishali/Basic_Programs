package Arrays;

import java.util.Scanner;

public class Checking_Discount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
			arr[i]= s.nextInt();
		int d = s.nextInt();
		for(int i=0; i<n; i++) {
			if(arr[i]%d == 0) {
				System.out.print("1");
			}
			else
			{
				System.out.print("0");
			}
		}
		s.close();

	}

}
