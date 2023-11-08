package Arrays;

import java.util.Scanner;

public class Odd_Even_Array {

	public static void main(String[] args) {
		int n,e=0,o=0; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no. of elements you want in array: ");
		n= s.nextInt();
		int arr[]=new int[n];
		int even[]= new int[n];
		int odd[]= new int[n];
		System.out.println("Enter all the elements: ");
		for(int i=0; i<n; i++)
			arr[i]= s.nextInt();
		System.out.print("Odd:");
		for(int i=0; i<n; i++) {
			if(arr[i]%2==0)
				even[e++]=arr[i];
			else
				odd[o++]=arr[i];
		}
		System.out.print("Odd: ");
		for(int i=0; i<o; i++) {
			if(i==o-1)
				System.out.print(odd[i] );
			else
				System.out.print(odd[i]+", " );
		}
			
		System.out.print("\nEven: ");
		for(int i=0; i<e; i++) {
			if(i==e-1)
				System.out.print(even[i] );
			else
				System.out.print(even[i]+", " );
		}
			
		s.close();

	}

}
