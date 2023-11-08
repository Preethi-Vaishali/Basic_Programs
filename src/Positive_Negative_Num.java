import java.util.Scanner;

public class Positive_Negative_Num {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in); 
		System.out.print(" Enter a num: ");
		n=s.nextInt();
		if(n>0)
			System.out.println(n+ " is a Positive Number");
		else if(n==0)
			System.out.println("Zero");
		else 
			System.out.println(n+ " is a Negative Number");
		s.close();
	}

}
