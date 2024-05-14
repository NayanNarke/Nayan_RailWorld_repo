package day8;

import java.util.Scanner;

public class IsPrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(isPrime(number)) {
			System.out.println(number + " is a Prime Number ");
		}else {
			System.out.println(number + " is not Prime Number ");
		}
	}

	public static boolean isPrime(int num) {
		
		if(num<1) {
			return false;
		}
		
		for(int i = 2; i<= Math.sqrt(num); i++) {
			if( num % i == 0 ) {
				return false;
			}
		}
		
		
		return true;
		
	}
	
	
}
