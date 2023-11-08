package Day_4;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		int stud_id, mark1, mark2, mark3;
		float total, avg;
		String stud_name;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the stud id: ");
		stud_id = s.nextInt();
		System.out.print("Enter the stud name: ");
		stud_name = s.next();
		System.out.print("Enter the mark1: ");
		mark1 = s.nextInt();
		System.out.print("Enter the mark2: ");
		mark2 = s.nextInt();
		System.out.print("Enter the mark3: ");
		mark3 = s.nextInt();
		total = mark1+mark2+mark3;
		avg= total/3;
		if(avg>=90)
			System.out.println("Excellent");
		if(avg>=80 && avg<90)
			System.out.println("Very Good");
		if(avg>=70 && avg<80)
			System.out.println("Good");
		if(avg>=60 && avg<70)
			System.out.println("Improve");
		if(avg>=50 && avg<60)
			System.out.println("Work Hard");
		if(avg>=40 && avg<50)
			System.out.print("Fail");
	}

}
