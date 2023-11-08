package loooping;

import java.util.Scanner;

public class String_Array {

	public static void main(String[] args) {
		int n; //number of array elements =5
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n = s.nextInt();// n =5
		String array1[]= new String[n];
		System.out.println("Enter the array element one by one:  ");
		for(int i=0; i<5; i++){ //0 to 4 =5
			array1[i] = s.next();
		}
		System.out.println("Output: ");
		for(int i=0; i<5; i++){
			System.out.println(array1[i]);	
		}
		s.close();
		
		
	}

}
