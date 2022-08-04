package OOP.Aggregation_and_composition_2;
import java.util.Scanner;

public class Car {
    private Wheel wheels;
    private Engine engine;
    private String brand;
    private double consumption;
    private double fuelLevel;

    public Car(String brand, double consumption, Engine engine, Wheel wheels, double fuelLevel) {
        this.brand = brand;
        this.consumption = consumption;
        this.engine = engine;
        this.wheels  =wheels;
        this.fuelLevel = fuelLevel;
    }

    public String toString() {
        return brand + "consumption: " + consumption + "l/km, engine: " + engine + ", wheels: " + wheels +
                ", fuel level: " + fuelLevel;
    }

    public static Car get(Scanner sc) {
        Car car = new Car("", 0, new Engine(0, 0),
                new Wheel("", 0, ""), 0);

        System.out.println("enter the brand of the car:");
        car.brand = sc.nextLine();

        System.out.println("enter consumption:");
        car.consumption = sc.nextDouble();

        System.out.println("enter fuel level:");
        car.fuelLevel = sc.nextDouble();

        System.out.println("enter information about the wheels:");
        car.wheels = Wheel.get(sc);

        System.out.println("enter information about the engine:");
        car.engine = Engine.get(sc);

        return car;
    }

    public void move() {
        if (fuelLevel <= 0) {
            System.out.println("there is no fuel, the car can not move.");
        }

        double distance = fuelLevel / consumption;
        System.out.println("the car has moved " + distance * 100 + "km");
        fuelLevel = 0;
    }

    public  void addFuel(double value) {
        fuelLevel += value;
    }

    public void changeWheels(Scanner sc) {
        wheels = Wheel.get(sc);
    }

}
