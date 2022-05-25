import java.time.OffsetDateTime;

public class Reservation {
    Room room;
    Reservee reservee;
    OffsetDateTime time;

    public Reservation(Room room, Reservee reservee) {
        this.room = room;
        this.reservee = reservee;
        time = OffsetDateTime.now();
    }
}
