package Arrays;

import java.util.Scanner;

public class Split_By_Position {

	public static void main(String[] args) {
		int n,pos; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no. of elements you want in array: ");
		n= s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter all the elements: ");
		for(int i=0; i<n; i++)
			arr[i]= s.nextInt();
		System.out.print("Enter the position from where you want to split: ");
		pos = s.nextInt();
		System.out.print("First array:");
		for(int i=0; i<pos; i++) {
			System.out.print(+arr[i]+" ");	
		}
		System.out.println();
		System.out.print("Second array:");
		for(int i=pos; i<n; i++) {
			System.out.print(arr[i]+ " ");	
		}
		s.close();
	}

}
