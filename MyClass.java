package day4;

public class MyClass {
	
    private int value;

    // Constructor method
    public MyClass(int initialValue) {
        this.value = initialValue;
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("Instance method called");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static method called");
    }

    // Getter method
    public int getValue() {
        return value;
    }

    // Setter method
    public void setValue(int newValue) {
        this.value = newValue;
    }

    public static void main(String[] args) {
    	
        // Creating an instance of MyClass
        MyClass myObj = new MyClass(10);

        // Calling instance method
        myObj.instanceMethod();

        // Calling static method
        MyClass.staticMethod();

        // Getting value using getter method
        int val = myObj.getValue();
        System.out.println("Value: " + val);

        // Setting value using setter method
        myObj.setValue(20);
        System.out.println("New Value: " + myObj.getValue());
    }
}


