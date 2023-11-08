package Arrays;

import java.util.Scanner;

public class IncrementOne_Arrays {

	public static void main(String[] args) {
		int n; 
		Scanner s = new Scanner(System.in);
		//System.out.print("Enter the number of elements: ");
		n= s.nextInt();
		int arr[]=new int[n];
		//System.out.println("Enter the array elements one by one: ");
		for(int i=0; i<n; i++)
			arr[i]= s.nextInt()+1;
		for(int i=0; i<n; i++) {
			//arr[i] +=1;
			System.out.print(arr[i]+" ");
		}
			s.close();

	}

}
