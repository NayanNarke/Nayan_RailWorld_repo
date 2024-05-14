package day8;

import java.util.Scanner;

public class PalindromeStr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (isPal(input)) {
            System.out.println("'" + input + "' is a palindrome.");
        } else {
            System.out.println("'" + input + "' is not a palindrome.");
        }
        
        scanner.close();

	}
	
	public static boolean isPal(String str) {
		
		str = str.toLowerCase();
		int left = 0;
		int right = str.length() -1;
		
		while(left < right ) {
			if(str.charAt(left) != str.charAt(right)) {
			return false;
			}
			
			left ++;
			right -- ; 
		}
		
		
		
		return true;
		
	}

}
