package Arrays;

import java.util.Scanner;

public class Remove_duplicates_fromsortedArray {

	public static void main(String[] args) {
		int n; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array size: ");
		n= s.nextInt();
		int arr[]=new int[n];
		int temp[]= new int[n];
		int length = arr.length;
		System.out.print("Enter array elements in sorted order: ");
		for(int i=0; i<n; i++) {
			arr[i]= s.nextInt();
		}
		System.out.print("After removing duplicate elements are: ");
		if (n==0 || n==1) {
			System.out.println("There are no sufficient number of elements");
		}
		int j =0;
		for(int i=0; i<n-1; i++) {
			if (arr[i] !=arr[i+1]) {
			temp[j++]= arr[i];
			}
		}
			temp[j++]=arr[n-1];
			for (int i=0; i<j; i++)
				arr[i] = temp[i];
			for (int i=0; i<length; i++)
			System.out.print(arr[i]+" ");
			s.close();	
		}
		
	}

