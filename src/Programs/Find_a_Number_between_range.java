package Programs;

import java.util.Scanner;

public class Find_a_Number_between_range {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//int count=0;
		int N = s.nextInt();
		s.useDelimiter("[\\s]+");
		int L = s.nextInt();
		int R = s.nextInt();
		/*for(int i=min; i<=max; i++) {
			if(n==i) {
				count++;
				System.out.println("yes");
				break;
			}
			
		}
		if(count==0)
			System.out.println("no");*/
		
		if(N>=L && N<=R)
			System.out.println("yes");
		else
			System.out.println("no");
		
		s.close();

	}

}
