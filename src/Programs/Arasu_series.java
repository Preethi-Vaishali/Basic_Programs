package Programs;

import java.util.Scanner;

public class Arasu_series {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//int temp =1;
		for(int i=1; i<=n; i++) {
			//temp = ((i*i)+1);
			System.out.print(((i*i)+1)+" ");
		}
		s.close();
	}

}
