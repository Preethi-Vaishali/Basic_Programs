package Programs;

import java.util.Scanner;

public class Gen_Prime_Numbers {

	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			int number=2;
			System.out.print("Enter the number: ");
			int n= s.nextInt();
			for(int i=1; i<=n; i++) {
				if(number==2) {
					System.out.print(2+" ");
					number++;
				}
				else {
					Task:
						for(int j=2; j<=number/2; j++) {
							//number=27, 27%3==0
							if(number%j==0) {
								number++;
								continue Task;
							}
						}
					System.out.print(number++ +" ");
				}
			}
			s.close();
			}

}
