package OOP.OOP_theSimplest_4;

import OOP.OOP_theSimplest_9.Book;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {

    private  Train[] trains;

    public Sort(Train[] trains) {
        this.trains = trains;
    }

    public void sortByNumber() {
        Arrays.sort(trains, Comparator.comparing(Train::getNumber));
        for (Train tr : trains) {
            System.out.println(tr);
        }
    }

    public void sortByDestination() {
        Arrays.sort(trains, Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));
        for (Train tr : trains) {
            System.out.println(tr);
        }
    }
}
