package Programs;

import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {
		 int n;
		 int sum=0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        n = s.nextInt();
	        int sq = n*n;
	        //System.out.println(sq);
	        while(sq>0) {
	        	//int d= ;
				sum = sum+sq%10;
			    sq= sq/10;
	        }
	        //System.out.println(sum);
	      
	        if(n==sum){
	            System.out.println(n+" is a neon number");
	        } 
	        else {
	            System.out.println(n+" is not a neon number");
	        }
	        	
	        s.close();

	}

}
