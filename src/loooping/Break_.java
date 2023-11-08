package loooping;
import java.util.Scanner;
public class Break_ {

	public static void main(String[] args) {
		for (int i=1; i<=10;i++) {
			if(i==6)
				break;
			else
				System.out.println("i= " +i);
		}
		System.out.println("Completed");
	}

}
