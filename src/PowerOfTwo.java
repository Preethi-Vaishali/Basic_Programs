import java.util.Scanner;

public class PowerOfTwo {
	static public boolean isPowerOfTwo(int x) {
		return (x!=0)&& ((x &(x-1)) == 0);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		System.out.println(isPowerOfTwo(n));
		s.close();

	}

}
