package Arrays;

import java.util.Scanner;

public class File_1 {
	void printarray(int n, int arr[]) {
		System.out.println("Array Elements: ");
		for(int i=0; i<n; i++)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		int n; 
		File_1 obj= new File_1();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n= s.nextInt();
		int arr[]=new int[n];
		//File_1 obj= new File_1();
		System.out.print("Enter the array elements one by one: ");
		for(int i=0; i<n; i++)
			arr[i]= s.nextInt();
		obj.printarray(n, arr);//Method Calling
		/*System.out.println("Array Elements: ");
		for(int i=0; i<n; i++)
			System.out.println(arr[i]);*/
		s.close();

	}

}
