package Wrapper_Class;

import java.util.Arrays;

public class Split_with_Limit {

	public static void main(String[] args) {
		String str = "a:bc:de:fg:h";
		
		//splitting array at":"
		
		//limit is -2; array contains all substrings
		String[]result = str.split(":",-2);
		System.out.println("Result when limit is -2 ="+ Arrays.toString(result));
		
		//limit is 0; array contains ALL SUBSTRINGS
		result = str.split(":",0);
		System.out.println("Result when limit is 0="+ Arrays.toString(result));
		
		//limit is 1;
		result = str.split(":",1);
		System.out.println("Result when limit is 1 ="+ Arrays.toString(result));
		
		//limit is 2; array contains a maximum of 2 substrings
		result = str.split(":",2);
		System.out.println("Result when limit is 2 ="+ Arrays.toString(result));
		
		//limit is 4; array contains a maximum of 4 substrings
		result = str.split(":",4);
		System.out.println("Result when limit is 4 ="+ Arrays.toString(result));
		
		//limit is 10; array contains a maximum of 10 substrings
		result = str.split(":",10);
		System.out.println("Result when limit is 10 ="+ Arrays.toString(result));
	}

}
