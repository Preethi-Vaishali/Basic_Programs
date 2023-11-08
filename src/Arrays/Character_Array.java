package Arrays;

import java.util.Scanner;

public class Character_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] words = str.split(" ");
		System.out.println(words[1]+" "+words[0]);
		s.close();

	}

}
