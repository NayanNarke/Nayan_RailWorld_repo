package day8;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
		int fact = 1 ;
		
		for (int i = 1 ; i <= num ; i++) {
			fact *= i;
			
		}
		
		System.out.println("The number " + num + " Factorial is " + fact);
		

	}

}
