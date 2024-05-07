package day4;

public class NestedTernaryExample {
    public static void main(String[] args) {
        int num = 15;
        String result = (num % 2 == 0) ? ((num > 10) ? "Even and greater than 10" : "Even and less than or equal to 10") : "Odd";
        System.out.println("The result is: " + result);
    }
}

