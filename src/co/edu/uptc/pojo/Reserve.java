package co.edu.uptc.pojo;

import java.util.Date;

public class Reserve {
    private Date reserveStart;
    private Room reservedRoom;
    private User user;

    public Reserve(Date reserveStart, Room reservedRoom, User user) {
        this.reserveStart = reserveStart;
        this.reservedRoom = reservedRoom;
        this.user = user;
    }

    public Date getReserveStart() {
        return reserveStart;
    }

    public void setReserveStart(Date reserveStart) {
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
