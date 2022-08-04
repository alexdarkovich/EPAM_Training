package OOP.Aggregation_and_composition_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car car = Car.get(sc);

        while (true) {
            System.out.println("choose: 0 - exit, 1 - move, 2 - add fuel, 3 - change wheels, 4 - info about the car");

            int choise = sc.nextInt();
            if (choise == 0)
                break;
            if (choise < 0 || choise > 4)
                System.out.println("incorrect number, choose again.");

            switch (choise) {
                case 1:
                    car.move();
                    break;
                case 2:
                    System.out.println("amount of fuel:");
                    int fuel = sc.nextInt();
                    car.addFuel(fuel);
                    break;
                case 3:
                    car.changeWheels(sc);
                    break;
                case 4:
                    System.out.println(car.toString());
                    break;
            }
        }
    }
}
