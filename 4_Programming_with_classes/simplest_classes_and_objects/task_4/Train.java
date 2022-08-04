package OOP.OOP_theSimplest_4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Train {

    private String destination;
    private int number;
    private LocalTime departureTime;

    public Train(String destination, int number, String time) {
        this.destination = destination;
        this.number = number;
        departureTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
    }
    public String toString() {
        return destination + ", " + number + ", " + departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }
}
