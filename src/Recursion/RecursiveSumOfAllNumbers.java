package Recursion;


public class RecursiveSumOfAllNumbers {
	public static void main(String[] args) {

		//Scanner s= new Scanner(System.in);
		//long n = s.nextLong();
		long sumOfAllNumbers =sumOfAllNumbers(9);
		System.out.println(sumOfAllNumbers);
	}
//A recursive example to sum all natural numbers up to a given long
	public static long sumOfAllNumbers(long number) {
		//stop the recursive program at 0
		
		if(number!=0)
			return number+sumOfAllNumbers(number-1);
		else
			return number;
	}
}
