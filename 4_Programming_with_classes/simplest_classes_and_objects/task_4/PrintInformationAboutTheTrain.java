package OOP.OOP_theSimplest_4;

import java.util.Scanner;

public class PrintInformationAboutTheTrain {

    public PrintInformationAboutTheTrain(Train[] trains) {
        printTrain(trains);
    }

    public void printTrain(Train[] trains) {
        System.out.print("Enter trains number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean check = false;
        for (Train tr : trains) {
            if (number == tr.getNumber()) {
                check = true;
                System.out.println("Trains destination: " + tr.getDestination() + ", trains number: " + tr.getNumber()
                + ", departure time: " + tr.getDepartureTime());
                break;
            }
        }
        if (!check) {
            System.out.println("The train is not available.");
            System.out.println("There are the next trains:");
            for (Train tr : trains) {
                System.out.println(tr.getNumber());
            }
        }
    }
}
