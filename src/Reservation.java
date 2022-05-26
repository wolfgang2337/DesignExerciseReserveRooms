public class Reservation {
    Room room;
    private String name;
    CampusRank rank;

    public Reservation(Room room, String name, CampusRank rank) {
        this.room = room;
        this.name = name;
        this.rank = rank;
    }

    public String toString() {
        return String.format("This is a reservation for %s by %s, who is rank %s", room, name, rank);
    }
}
