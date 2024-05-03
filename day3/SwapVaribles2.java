package day3;

import java.util.Scanner;

public class SwapVaribles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a); 
        System.out.println("b = " + b);

	}

}
