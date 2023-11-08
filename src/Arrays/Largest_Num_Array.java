package Arrays;

import java.util.Scanner;

public class Largest_Num_Array {

	public static void main(String[] args) {
		int n, large, small; 
		Scanner s = new Scanner(System.in);
		System.out.print("Input: ");
		n= s.nextInt();
		int arr[]=new int[n];
		//System.out.println("Enter the array elements one by one: ");
		for(int i=0; i<n; i++) 
			arr[i]= s.nextInt();
		large = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i]>large)
				large=arr[i];
		}System.out.println("Largest= " +large);
		small = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i]<small)
				small=arr[i];
		}System.out.println("Smallest= " +small);
s.close();
	}

}
