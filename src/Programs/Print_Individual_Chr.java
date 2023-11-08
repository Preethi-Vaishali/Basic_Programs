package Programs;

import java.util.Scanner;

public class Print_Individual_Chr {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str;
	System.out.print("Enter the String :");
	str = s.next();
	System.out.println("Individual characters from given string: ");
 
        // Iterate through the given string to
        // display the individual characters
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
	}
	}

}
