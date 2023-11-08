package Float_Programs;

import java.util.Scanner;

public class Inputgetting {

	public static void main(String[] args) {
		int num1, num2;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		num1 = s.nextInt();
		System.out.print("Enter the 2nd number: ");
		num2 = s.nextInt();
		System.out.println(num1+num2);
		s.close();

	}

}
