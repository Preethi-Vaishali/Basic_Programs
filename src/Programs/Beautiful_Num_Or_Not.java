package Programs;

import java.util.Scanner;

public class Beautiful_Num_Or_Not {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]= new int[n];
		int sum=0;
		for(int i=0; i<n; i++)
			arr[i] = s.nextInt();
		for(int i=0; i<n; i++) {
			sum +=arr[i];
		}
		if(sum%2==0 && sum%3==0 && sum%5==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		s.close();

	}

}
