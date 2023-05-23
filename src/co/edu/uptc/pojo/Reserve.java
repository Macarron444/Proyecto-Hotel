package co.edu.uptc.pojo;

public class Reserve {
    private DateReservation reserveStart;
    private Room reservedRoom;
    private User user;

    public Reserve(DateReservation reserveStart, Room reservedRoom, User user) {
        this.reserveStart = reserveStart;
        this.reservedRoom = reservedRoom;
        this.user = user;
    }

    public DateReservation getReserveStart() {
        return reserveStart;
    }

    public void setReserveStart(DateReservation reserveStart) {
        this.reserveStart = reserveStart;
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
}
