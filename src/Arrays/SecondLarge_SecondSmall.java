package Arrays;

import java.util.Scanner;

public class SecondLarge_SecondSmall {

	public static void main(String[] args) {
		int n, temp=0; 
		Scanner s = new Scanner(System.in);
		//System.out.print("Enter the no. of elements you want in array: ");
		n= s.nextInt();
		int arr[]=new int[n];
		//System.out.println("Enter all the elements: ");
		for(int i=0; i<n; i++)
			arr[i]= s.nextInt();
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++)
			{
			if(arr[i]>arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
		}
//Print the array after sorting
		System.out.print("After Sorting array elements in Ascending are: ");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.print("After Sorting array elements in Decending are: ");
		for(int i=n-1; i>=0; i--)
			System.out.print(arr[i]+" ");
		System.out.println();
		/*System.out.print("Second Smallest: ");
		for(int i=0; i<n; i++) {if(i==1) {
			System.out.print(arr[i]+" ");}
		}
		System.out.println();
		System.out.print("Second Largest: ");
		for(int i=n-1; i>=0; i--){if(i==n-2) {
			System.out.print(arr[i]+" ");}}*/
		
		System.out.print("Second Smallest: "+arr[1]);
		System.out.println();
		System.out.print("Second Largest: "+arr[n-2]);
		s.close();

	}

}
