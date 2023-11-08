package Programs;

import java.util.Scanner;

public class Perfect_Square {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N, M;
		s.useDelimiter("\\s");
		N = s.nextInt();
		M = s.nextInt();
		//sq= Math.sqrt(N*M);
		if(N==M) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		s.close();

	}

}
