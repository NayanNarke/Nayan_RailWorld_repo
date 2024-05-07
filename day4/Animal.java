package day4;


//Define an interface
interface Animal {
 void sound(); // Method signature for making a sound
}

//Class Dog implementing the Animal interface
class Dog implements Animal {
 // Implementing the sound method defined in the Animal interface
 public void sound() {
     System.out.println("Woof");
 }
}

//Class Cat implementing the Animal interface
class Cat implements Animal {
 // Implementing the sound method defined in the Animal interface
 public void sound() {
     System.out.println("Meow");
 }
}

