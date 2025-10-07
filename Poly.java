
class MathOperation {
 // Method Overloading: same method name, different parameters
 int multiply(int a, int b) {
     return a * b;
 }

 double multiply(double a, double b) {
     return a * b;
 }
}


class Vehicle {
 void move() {
     System.out.println("The vehicle is moving.");
 }
}


class Car extends Vehicle {
 
 void move() {
     System.out.println("The car is driving on the road.");
 }
}


class Bicycle extends Vehicle {
 
 void move() {
     System.out.println("The bicycle is being pedaled on the street.");
 }
}
class Math {
 public static void main(String[] args) {
    
     MathOperation math = new MathOperation();
     System.out.println("Multiply (int): " + math.multiply(5, 3));
     System.out.println("Multiply (double): " + math.multiply(2.5, 4.0));

     // Method Overriding
     Vehicle v1 = new Car();     // Vehicle reference to Car object
     Vehicle v2 = new Bicycle(); // Vehicle reference to Bicycle object

     v1.move();  // Calls Car's version
     v2.move();  // Calls Bicycle's version
 }
}
