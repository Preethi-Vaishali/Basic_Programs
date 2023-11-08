package Wrapper_Class;

import java.util.Arrays;

public class Boolean_2_String {

	public static void main(String[] args) {
		//create boolean variables
		
		boolean booleanValue1 = true;
		boolean booleanValue2 = false;
		//convert boolean to string using toString()
		
		String stringvalue1 = Boolean.toString(booleanValue1);
		String stringvalue2 = Boolean.toString(booleanValue2);
		System.out.println(stringvalue1);
		System.out.println(stringvalue2);

	}

}
