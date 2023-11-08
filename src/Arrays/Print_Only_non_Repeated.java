package Arrays;

import java.util.Scanner;

public class Print_Only_non_Repeated {

	public static void main(String[] args) {
		int n, c=0, flag=0; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		n= s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0; i<n; i++) {
			//System.out.print("Enter array elements of index "+i+": ");
			arr[i]= s.nextInt();
		}
		/*System.out.println("Before removing duplicate elements are: ");
		for(int i=0; i<n; i++)
			System.out.println(arr[i]);*/
		System.out.println("The elements are: ");
		for(int i=0; i<n; i++) {
			c =0;
			for(int j=0; j<n; j++) {
				if(arr[i]==arr[j] && i!=j) 
					c++;
					
			}
			if(c==0) {
				System.out.print(arr[i]+" ");
				flag=1;
			}
	
		}
		 if(flag==0)
			System.out.println("All elements are repeated");
	s.close();
	}

}
