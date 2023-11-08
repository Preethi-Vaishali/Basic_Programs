package Arrays;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {
		char ch; 
		Scanner s = new Scanner(System.in);
		System.out.print("Input: ");
		ch= s.next().charAt(0);
		switch(ch) {
		case ('a' | 'A'):
		case ('e' | 'E'):
		case ('i' | 'I'):
		case ('o' | 'O'):
		case ('u' | 'U'):
			System.out.println("Vowel");
		break;
		default: 
			System.out.println("Consonant");
		}s.close();

	}

}
