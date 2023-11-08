package Arrays;

import java.util.Scanner;

public class Duplicate_Element_In_Array {

	public static void main(String[] args) {
		int n, flag=0; //switch on and off concept using flag variable
		Scanner s = new Scanner(System.in);
		//System.out.print("Input: ");
		n= s.nextInt();
		int arr[]=new int[n];
		//System.out.println("Enter the array elements one by one: ");
		for(int i=0; i<n; i++)
			arr[i]= s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j =i+1; j<n;j++) {
			
			if(arr[i]==arr[j]) { 
				System.out.println(arr[i]+" ");
			flag=1;
			} 
		}}
		if(flag==0)
			System.out.println("No Duplicates");
	s.close();

	}

}
