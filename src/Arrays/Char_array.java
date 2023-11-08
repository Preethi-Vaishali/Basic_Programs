package Arrays;

import java.util.Scanner;

public class Char_array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		//System.out.print(str);
		int n = str.length();
		char ch[]= str.toCharArray();
		/*for(int i=o; i<n; i++)
		 * System.out.print(ch[i]);
		 * System.out.println();
		 */
		for(int i=0; i<n-1; i+=2) {
			System.out.print(ch[i+1]+""+ch[i]);
		}
	
	}

}
