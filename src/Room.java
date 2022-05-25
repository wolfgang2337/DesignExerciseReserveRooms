public class Room {
    private int roomNumber;
    private Building building;
    public boolean booked;

    public Room(int roomNumber, Building building) {
        this.roomNumber = roomNumber;
        this.building = building;
        booked = false;
    }

    public String toString() {
        return String.format("This is room number %d, located in %s", roomNumber, building);
    }
}
