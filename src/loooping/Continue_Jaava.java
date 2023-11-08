package loooping;
import java.util.Scanner;
public class Continue_Jaava {

	public static void main(String[] args) {
		for (int i=1; i<=10;i++) {
			if(i==6)
				continue;
			else
				System.out.println("i= " +i);
		}
		System.out.println("Completed");
	}
	}
