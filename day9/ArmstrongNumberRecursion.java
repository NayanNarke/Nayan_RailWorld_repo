package day9;

public class ArmstrongNumberRecursion {
	 public static void main(String[] args) {
	        int number = 153;
	        if (isArmstrong(number))
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }

	    public static boolean isArmstrong(int number) {
	        int numberOfDigits = countDigits(number);
	        return number == calculateArmstrong(number, numberOfDigits);
	    }

	    public static int countDigits(int number) {
	        if (number == 0)
	            return 0;
	        return 1 + countDigits(number / 10);
	    }

	    public static int calculateArmstrong(int number, int power) {
	        if (number == 0)
	            return 0;
	        int digit = number % 10;
	        return (int) (Math.pow(digit, power) + calculateArmstrong(number / 10, power));
	    }
}
