package Number_Methods;

public class File1 {

	public static void main(String[] args) {
		//Wrapper Class Concept
		//Converting Integer Object into Float/Double Object
		Integer x =10;
		Float f= x.floatValue();
		System.out.println(x.floatValue());
		System.out.println("f = "+f);
		
		//Converting Primitive Data type to objects
		String str = "10";//Primitive Data type
		Integer y = Integer.parseInt(str);
		Double d = y.doubleValue();
		System.out.println("y = "+y);
		System.out.println("d = "+d);
		//String str2 = d.toString();
		System.out.println(d.toString());
		System.out.println(String.valueOf(str));
		
		Integer num1 = 10;
		Integer num2 = 5;
		Integer num3 = 5;
		System.out.println(num1.compareTo(num2));
		System.out.println(num2.compareTo(num1));
		System.out.println(num2.compareTo(num3));
		System.out.println(num1.equals(num2));
		System.out.println(num3.equals(num2));
		
		
		String a="hello";
		String b="hello";
		String B="Hello";
		if(a.equals(b))
			System.out.println("Both Strings are equal");
		
		if(a.compareTo(b)==0)
			System.out.println("Both Strings are equal");
				
		if(a.equals(B))
			System.out.println("Both Strings are equal");
		else
			System.out.println("Both Strings are not equal");
		
		if(a.compareTo(B)==0)
			System.out.println("Both Strings are equal");
		else
			System.out.println("Both Strings are not equal");
		Double f1 = -20.45;
		Double f2 = -20.54;
		System.out.println("abs = "+ Math.abs(4-7));
		System.out.println("Ceil = "+ Math.ceil(f1));//Rounds to the lower number
		System.out.println("Round = "+ Math.round(f1));
		System.out.println("Round = "+ Math.round(f2));//Rounds to the highest value and gives output in integer
		System.out.println("Floor = "+ Math.floor(f1) );//Rounds to the higher value
		System.out.println("Min = "+ Math.min(12, 24));
		System.out.println("Max = "+ Math.max(12, 24));
		System.out.println("Power= "+ Math.pow(2, 3));
		System.out.print("Escape Seuence = \r");
		System.out.println("Escape Seuence = \n");
		System.out.println("This is \"Java\" Program");
		System.out.println("This is \'Java\' Program");
		
		//Character Methods
		System.out.println(Character.isLetter('5'));//Input should be in character type '5'
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isLowerCase('C'));
		System.out.println(Character.isLowerCase('c'));
		System.out.println(Character.isUpperCase('C'));
		System.out.println(Character.isUpperCase('c'));
		System.out.println(Character.isLowerCase('\t'));//   \t &\n are escape sequences and so false is printed
		System.out.println(Character.isLowerCase('\n'));
		System.out.println(Character.toUpperCase('d'));
		System.out.println(Character.toLowerCase('D'));
		
		
		//String Methods
		String st= "Welcome";//A- 65, W- 87
		String st2= "welcome";//a=97; w=119
		System.out.println(st.charAt(5));
		//System.out.println(st.charAt(10));
		System.out.println(st.compareTo(st2));//87-119= -32
		System.out.println(st.compareToIgnoreCase(st2));
		System.out.println(st2.concat(st));
		System.out.println(st2.length());
		System.out.println(st.substring(4));
		System.out.println(st.substring(2,7));
		System.out.println(st.replace('e','a'));
		
		
		
		
	}


}
