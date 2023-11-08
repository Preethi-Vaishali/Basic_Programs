package access_modifier;

public class File1 {
    public int a =10;//class variable- default access modifier - visible inside the package
	private int b =10;
	//private modifier is visible only inside the defined/declared or initialized class
	public void display() {
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}

}
//public - visible to the world
//protected - visible to same package and sub package
//private modifier - visible only inside the defined/declared or initialized class
//default access modifier - visible inside the package