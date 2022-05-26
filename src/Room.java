public class Room {
    int roomNumber;
    Building building;

    public Room(int roomNumber, Building building) {
        this.roomNumber = roomNumber;
        this.building = building;
    }

    public String toString() {
        return String.format("room number %d, located in %s", roomNumber, building);
    }

    public boolean equals(Room room) {
        if(room.roomNumber == this.roomNumber && room.building == this.building) {
            return true;
        } else {
            return false;
        }
    }
}
