package Rough;
class First{
	public void display() {
		System.out.print("FD");
	}
}
class Second extends First{
	public void display() {
		System.out.print("SD");
	}
}
class Third extends Second{
	public void display() {
		System.out.print("TD");
	}
}
public class Source extends Third{

	public static void main(String[] args) {
		First obj = new Second();
		//super.display();
		obj.display();

	}

}
