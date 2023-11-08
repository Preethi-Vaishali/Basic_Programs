package Variable_Types;

public class Test {
	int b=100;  //instance variable or class variable have default value = 0
	public static int x=20;
	public void local_var() {
		int a =10;// local variable does not have the default value
		
		System.out.println("Local a= "+a);
		System.out.println("Local b= "+b);
	}
	void display() {
		//System.out.println(a);
		System.out.println("Display b= "+b);
	}
	public static void main(String[] args) {
		Test o = new Test();
		o.local_var();
		o.display();
		System.out.println(o.b);
		System.out.println(x);

	}

}
