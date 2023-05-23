package co.edu.uptc.pojo;

public class DateReservation {
    private int day;
    private int month;
    private int year;

    public DateReservation() {
        day = -1;
        month = -1;
        year = -1;
    }
    public DateReservation(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
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
