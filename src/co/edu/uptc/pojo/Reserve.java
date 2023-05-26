package co.edu.uptc.pojo;

public class Reserve {
    private int day;
    private int month;
    private int year;
    private Room reservedRoom;
    private User user;

    public Reserve(int day, int month, int year, Room reservedRoom, User user) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.reservedRoom = reservedRoom;
        this.user = user;
    }

    public Room getReservedRoom() {
        return reservedRoom;
    }

    public void setReservedRoom(Room reservedRoom) {
        this.reservedRoom = reservedRoom;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
        return "Reserve{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", reservedRoom=" + reservedRoom +
                ", user=" + user +
                '}';
    }
}
