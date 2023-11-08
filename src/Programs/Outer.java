package Programs;

public class Outer {
	//static member of the outer class
	private static char grade = 'A';
	
	static void test() {
		System.out.println("Grade: Inside static method "+grade);
	}
	//static class
	static class Nested{
		//non-static method
		public void fun() {
			//nested class can access the static members of the outer class
			System.out.println("Grade: Inside Nested class: "+grade);
		}
	}
	public class check{
		void display() {
			System.out.println("Check class Grade: "+grade);
		}
	}

	public static void main(String[] args) {
		Outer.Nested obj = new Outer.Nested();
		obj.fun(); //static class method
		System.out.println("static variable: "+grade);//static variable
		test();//static method inside the outer class
		Outer.check ck = new Outer().new check();
		ck.display();

	}

}
