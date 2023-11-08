package loooping;

public class Con_ {

	public static void main(String[] args) {
		for (int i=1; i<=10;i++) {
			if(i==6 || i==8)
				System.out.println("i= " +i);
			else
				continue;
		}
		System.out.println("Completed");
	}

}
