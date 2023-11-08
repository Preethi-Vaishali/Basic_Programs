package Programs;

import java.util.Scanner;

public class Sunny_Number {

	public static void main(String[] args) {
		 int n;

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a number: ");
	        n = sc.nextInt();

	        double sqrt = Math.sqrt(n + 1);
	        double floor = Math.floor(sqrt);
	        //System.out.println(sqrt);
	       // System.out.println(floor);

	        if (sqrt - floor == 0) {
	            System.out.println(n+" is a sunny number");
	        } 
	        else {
	            System.out.println(n+" is not a sunny number");
	        }
	    }
	}

