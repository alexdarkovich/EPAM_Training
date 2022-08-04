package OOP.Aggregation_and_composition_2;

import java.util.Scanner;

public class Wheel {

    private String brand;
    private double diameter;
    private String type;

    public Wheel(String brand, double diameter, String type) {
        this.brand = brand;
        this.diameter = diameter;
        this.type = type;
    }

    public String toString() {
        return brand + ",diameter: " + diameter + ", type: " + type;
    }

    public static Wheel get (Scanner sc) {
        Wheel wheel = new Wheel("", 0, "");

        System.out.print("enter brand: ");
        wheel.brand = sc.nextLine();

        System.out.print("enter diameter: ");
        wheel.diameter = sc.nextDouble();

        System.out.print("enter type (1) - winter, (2) - summer: ");
        wheel.type = sc.nextLine();

        return wheel;
    }

    public double get_diameter() {
        return diameter;
    }
}