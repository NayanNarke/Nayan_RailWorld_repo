package day8;

import java.util.Scanner;

public class palindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		if(isPalinsrom(num)) {
			System.out.println(num + " is Palindrome Number");
		}else {
			System.out.println(num + " Not  Palindrome Number");
		}
			
	

	}
	
	public static boolean isPalinsrom(int n ) {
		
		int revNum = 0 ;
		int orgNum = n;
		
		while(n != 0 ) {
			int digit = n % 10;
			revNum = revNum * 10 + digit;
			n /= 10;
		}
		
		return revNum == orgNum ;
		
		
	}
	

}
