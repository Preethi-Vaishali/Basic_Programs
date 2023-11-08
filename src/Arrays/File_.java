package Arrays;

import java.util.Scanner;

public class File_ {

	public static void main(String[] args) {
		int n; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n= s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements one by one: ");
		for(int i=0; i<n; i++)
			arr[i]= s.nextInt();
		System.out.println("Array Elements: ");
		for(int i=0; i<n; i++)
			System.out.println(arr[i]);
		s.close();
	}

}
