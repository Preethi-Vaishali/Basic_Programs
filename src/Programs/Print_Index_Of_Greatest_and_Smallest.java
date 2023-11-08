package Programs;

import java.util.Scanner;

public class Print_Index_Of_Greatest_and_Smallest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n; i++)
			arr[i] = s.nextInt();
		int min_ind = 0;
		int max_ind = 0;
		for(int i=1; i<n; i++) {
			if(arr[i]<arr[min_ind])
				min_ind=i;
			if(arr[i]>arr[max_ind])
				max_ind=i;
				
				}System.out.print((min_ind+1)+" "+(max_ind+1));
		s.close();
		

	}

}
