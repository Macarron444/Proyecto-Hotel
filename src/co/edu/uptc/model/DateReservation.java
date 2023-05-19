package co.edu.uptc.model;

public class DateReservation {
    private int day;
    private int month;
    private int year;

    public DateReservation(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "DateReservation{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
