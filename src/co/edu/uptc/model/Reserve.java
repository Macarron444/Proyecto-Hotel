package co.edu.uptc.model;

import java.time.LocalDate;

public class Reserve {
    private LocalDate reserveStart;
    private Room reservedRoom;
    private User user;

    public LocalDate getReserveStart() {
        return reserveStart;
    }

    public void setReserveStart(LocalDate reserveStart) {
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

    public Reserve(LocalDate reserveStart, Room reservedRoom, User user) {
        this.reserveStart = reserveStart;
        this.reservedRoom = reservedRoom;
        this.user = user;
    }
}
