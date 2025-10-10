class MathOperation {
   
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
        System.out.println("The bicycle is pedaling on the street.");
    }
}

class Math {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();

      
        System.out.println("Multiply (int): " + math.multiply(5, 4));
        System.out.println("Multiply (double): " + math.multiply(2.5, 3.5)); 

        
        Vehicle v1 = new Car();     
        Vehicle v2 = new Bicycle(); 

        v1.move();  
        v2.move();  
    }
}
