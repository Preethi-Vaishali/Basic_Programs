package Wrapper_Class;

import java.util.Arrays;

public class String_to_Char {

	public static void main(String[] args) {
		String st= "This is Great";
		char[] chars = st.toCharArray();
		for(int i=0; i<chars.length; i++)
		{
			if(i==chars.length-1)
				System.out.print(chars[i]);
			else
			System.out.print(chars[i]+", ");
		}System.out.println();
		System.out.println(Arrays.toString(chars));
	}

}
