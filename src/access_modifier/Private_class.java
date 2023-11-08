package access_modifier;

class base {
	int stud_no = 12; //stud_no,stud_name----state
	String stud_name ="Vijay";
	void display()//behaviour
	{
		System.out.println("Student ID: "+stud_no);
		System.out.println("Student Name: "+stud_name);
		
	}
}
public class Private_class{
	public static void main(String[] args) {
		base obj=new base();
		System.out.println("Calling the method");
		obj.display();
		System.out.println("Calling the state");
		System.out.println(obj.stud_name);

	}

}
