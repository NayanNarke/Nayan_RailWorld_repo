package day5;
import java.util.Scanner;


public class ElectricityBillGenerator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of units consumed:");
        int unitsConsumed = scanner.nextInt();

       
        double billAmount = (unitsConsumed <= 100) ? unitsConsumed * 2 :
                            (unitsConsumed <= 150) ? 100 + (unitsConsumed - 100) * 3 :
                            (unitsConsumed <= 200) ? 200 + (unitsConsumed - 150) * 4 :
                            (unitsConsumed <= 250) ? 300 + (unitsConsumed - 200) * 5 :
                            (unitsConsumed <= 300) ? 400 + (unitsConsumed - 250) * 6 :
                            (unitsConsumed <= 500) ? 700 + (unitsConsumed - 300) * 7 :
                            1500 + (unitsConsumed - 500) * 8;

        
        System.out.println("Electricity Bill: " + billAmount);

        scanner.close();
    }

	}


