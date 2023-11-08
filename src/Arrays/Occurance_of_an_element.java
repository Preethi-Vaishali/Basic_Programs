package Arrays;

import java.util.Scanner;

public class Occurance_of_an_element {

	public static void main(String[] args) {
		int n,n1,count=0; 
		Scanner s = new Scanner(System.in);
		//System.out.print("Input: ");
		n= s.nextInt();
		int arr[]=new int[n];
		//System.out.println("Enter the array elements one by one: ");
		for(int i=0; i<n; i++)
			arr[i]= s.nextInt();
		System.out.println("Enter the element you want to check Occurance? ");
		n1 = s.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==n1) 
				count++;
				
			}System.out.println(count);
			
	s.close();	}

	}


