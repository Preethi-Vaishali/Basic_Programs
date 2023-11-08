package Wrapper_Class;

public class CharString {

	public static void main(String[] args) {
		char ch='c';
		String st= Character.toString(ch);
		//Alternatively
		String st1= String.valueOf(ch);
		System.out.println("The string is: "+st);
		System.out.println("The string is: "+st1);
		
		char[] c = {'a','e','i','o','u'};
		String stri= String.valueOf(c);
		String st2= new String(c);
		System.out.println(stri);
		System.out.println(st2);

	}

}
