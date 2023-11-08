package Arrays;

import java.util.Scanner;

public class Occuranceofanelement {

	public static void main(String[] args) {
		int n, n1, count=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array: ");
		n = s.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter all elements:");
		for(int i=0; i<n; i++)
			arr[i]= s.nextInt();
		System.out.print("Enter the element of which you want to count number of occurances: ");
		n1= s.nextInt();
		for(int i=0; i<n; i++)
		{
			if(arr[i]==n1)
				count++;
		}
		if(count>0)//count==0 ---- element not found and in else print num of occurances
			System.out.print("Number of Occurance of the Element: "+count);
		else
			System.out.println("Element not present");
		s.close();
	}

}
