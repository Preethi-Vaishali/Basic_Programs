package Programs;

import java.util.Scanner;

public class Position_of_Element {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter all the elements: ");
		for(int i =0; i<n; i++)
			arr[i] = s.nextInt();
		System.out.print("Enter the element you want to find: ");
		int find = s.nextInt();
		int count =0;
		for(int i=0; i<n; i++) {
			if(arr[i]==find) {
				System.out.print("Element found at position: "+ (i+1));
				count++;
			}
		}
		if(count == 0)
			System.out.print("Element not found");
		
		s.close();
	}

}
