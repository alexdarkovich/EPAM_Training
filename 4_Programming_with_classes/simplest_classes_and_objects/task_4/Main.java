package OOP.OOP_theSimplest_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Train[] trains = {new Train("Brest", 34, "12:40"),
                          new Train("Molodechni", 543, "23:00"),
                          new Train("Grodno", 678, "15:44"),
                          new Train("Vitebsk", 123, "05:56"),
                          new Train("Lida", 444, "21:55")};

        Sort sort = new Sort(trains);

        System.out.println("Choose: 1 - sort by number, 2 - sort by destination, 3 - get information about the train" +
                " by its number, 4 - exit");

        while (true) {
            int choise = new Scanner(System.in).nextInt();

            if (choise == 1) {
                sort.sortByNumber();
            } else if (choise == 2) {
                sort.sortByDestination();
            } else if (choise == 3) {
                PrintInformationAboutTheTrain print = new PrintInformationAboutTheTrain(trains);
            } else if (choise == 4) {
                break;
            } else {
                System.out.println("Incorrect number");
            }
        }
    }
}
