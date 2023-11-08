package Arrays;

import java.util.Scanner;

public class Diff_Bet_Index_Of_nos {

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
		}System.out.println((max_ind-min_ind));
		s.close();

	}

}
