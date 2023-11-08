package Programs;

import java.util.Scanner;
import java.util.*;

import Methods.logic.Functions;

public class Find_the_smallest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//ArrayList<Integer> num= new ArrayList<Integer>();
		Functions test = new Functions();
		int find;
		int n = s.nextInt();
		int min=0, max=0, num;
		int a[] = new int[n];
		for(int i =0; i<n; i++) {
			a[i]=s.nextInt();
		}
		
		min = test.min(a);
		max = test.max(a);
		System.out.println("Smallest value: "+ min);
		System.out.println("Largest value: "+ max);
		System.out.println();
		System.out.print("Enter the value to find : ");
		find = s.nextInt();
		find = test.find(a, find);
		System.out.println("The value is found the position : " + find);
		find = test.find(a, find);
		System.out.println("Enter the number to find prime or not : ");
		num=s.nextInt();
		System.out.println("Number "+num+ "is Prime or not: "+test.primeNum(num));
		System.out.println("Prime numbers are : "+ test.primeNum(a,n));
		}
		
}
