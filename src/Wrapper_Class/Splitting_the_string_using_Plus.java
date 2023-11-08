package Wrapper_Class;

import java.util.Arrays;

public class Splitting_the_string_using_Plus {
	public static void main(String[] args) {
		String str = "a+e+f";
		
		//splitting the string at "+"
		String[] result = str.split("\\+");
		
		//converting array to string and printing it
		System.out.println("Result= "+ Arrays.toString(result));
			
	}
}
