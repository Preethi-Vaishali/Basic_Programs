package Programs;

import java.util.Scanner;

public class Right_angled_Triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.useDelimiter("\\s");
		int a, b, c, sq, n;
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		if(c>a && c>b) {
			sq = c*c;
			n = (b*b) + (a*a);
			if(sq==n)
				System.out.println("Yes");
			else
				System.out.print("No");
		}
		else if(b>a && b>c) {
			sq = b*b;
			n = (c*c) + (a*a);
			if(sq==n)
				System.out.println("Yes");
			else
				System.out.print("No");
		}
		else if(a>b && a>c) {
			sq = a*a;
			n = (c*c) + (b*b);
			if(sq==n)
				System.out.println("Yes");
			else
				System.out.print("No");
		}
	
	s.close();
	}

}
