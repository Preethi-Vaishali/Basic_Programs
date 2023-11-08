package loooping;

import java.util.Scanner;

public class Array_Input {

	public static void main(String[] args) {
	//int arr[]={10,20,30,40,50};
		 
	int n; //number of array elements =5
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the number of elements: ");
	n = s.nextInt();// n =5
	int arr[]= new int[n]; // int arr[]= new int[5] = Integer array

	
	System.out.println("Enter the array element one by one:  ");
	for(int i=0; i<5; i++){ //0 to 4 =5
		arr[i] = s.nextInt();
	}
	System.out.println("Output: ");
	for(int i=0; i<5; i++){
		System.out.println(arr[i]);	
	}
	s.close();
	}

}
