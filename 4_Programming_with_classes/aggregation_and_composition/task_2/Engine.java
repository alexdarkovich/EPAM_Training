package OOP.Aggregation_and_composition_2;
import java.util.Scanner;

public class Engine {
    private int number;
    private double power;

    public Engine(int number, double power) {
        this.number = number;
        this.power = power;
    }

    public String toString() {
        return "engine: " + number + ", power: " + power;
    }

    public static Engine get(Scanner sc) {
        Engine engine = new Engine(0, 0);

        System.out.println("enter the engine's number:");
        engine.number = sc.nextInt();

        System.out.println("enter the engine's power:");
        engine.power = sc.nextDouble();

        return engine;
    }
}
