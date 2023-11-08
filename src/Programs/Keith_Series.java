package Programs;

import java.util.Scanner;

public class Keith_Series {

	public static void main(String[] args) {
		int f1=0, f2=0, f3,num,f4; 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num= s.nextInt();
		String str = String.valueOf(num);
		if(str.length()==3) {
		f3 = num%10;
		num = num/10;
		f2 = num%10;
		num = num/10;
		f1= num%10;
		System.out.print(f1+" "+f2+" "+f3+" ");
		for(int i=3; i<=10; i++) {
			f4=f1+f2+f3;
			System.out.print(f4+" ");
			f1=f2;
			f2=f3;
			f3=f4;
		}
		
		}
		s.close();

	}

}
