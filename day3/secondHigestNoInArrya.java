package day3;

import java.util.Scanner;

public class secondHigestNoInArrya {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

      
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int num : arr) {
        	
            if (num > max) {
                secondMax = max;
                max = num;
                
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        
        System.out.println("The second highest element in the array is: " + secondMax);

        scanner.close();

}
}