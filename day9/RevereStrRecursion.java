package day9;

public class RevereStrRecursion {

	public static void main(String[] args) {
        int n = 10; 
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacciHelper(n, 0, 1);
    }

    public static int fibonacciHelper(int n, int a, int b) {
        if (n == 0)
            return a;
        else if (n == 1)
            return b;
        else
            return fibonacciHelper(n - 1, b, a + b);
    }

}
