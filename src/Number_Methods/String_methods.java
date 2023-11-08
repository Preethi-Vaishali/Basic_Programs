package Number_Methods;

public class String_methods {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer("20");
		StringBuffer s3 = new StringBuffer("Welcome");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.append("abcdefghijklmnopqr stuvwxyzhh;iugj ihohliyfiugjnkj uglihbliygliujb");
		
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.setLength(5);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		System.out.println(s1);
		System.out.println(s1.reverse());

	}

}
