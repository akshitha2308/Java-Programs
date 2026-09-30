class Vehicle {
    void move()  {System.out.println("Vehicle moves");}
}

class Car extends Vehicle {
    void wheels() {System.out.println("Car has 4 wheels");}
}

class ElectricCar extends Car {
    void charge() {System.out.println("Battery charging");}
}

public class Main9 {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.move();
        e.wheels();
        e.charge();
    }
}