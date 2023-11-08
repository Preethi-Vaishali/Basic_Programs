package Arrays;

import java.util.Scanner;

public class Sum_Avg {

	public static void main(String[] args) {
		int n, sum, avg; 
		Scanner s = new Scanner(System.in);
		System.out.print("Input: ");
		n= s.nextInt();
		int arr[]=new int[n];
		//System.out.println("Enter the array elements one by one: ");
		for(int i=0; i<n; i++) 
			arr[i]= s.nextInt();
		sum=arr[0];
		for(int i=1; i<n; i++) {
			
			sum += arr[i];
		}System.out.println("Sum= "+ sum);
		avg = sum/n;
		System.out.println("Average= "+ avg);
		s.close();

	}

}
