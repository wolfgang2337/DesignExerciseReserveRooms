import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RoomReserver r = new RoomReserver();
        r.addReservation(new Reservation(new Room(111, Building.AH), "Dean Thomas", CampusRank.DEAN));
        r.addReservation(new Reservation(new Room(121, Building.AH), "lol", CampusRank.STUDENT));
        r.addReservation(new Reservation(new Room(111, Building.AH), "Dean Maria", CampusRank.DEAN));
        r.addReservation(new Reservation(new Room(111, Building.OM), "Dean Schnider", CampusRank.DEAN));
        r.addReservation(new Reservation(new Room(211, Building.AH), "Professor Dahl", CampusRank.PROFESSOR));
        r.addReservation(new Reservation(new Room(121, Building.CFA), "f", CampusRank.STUDENT));
        r.addReservation(new Reservation(new Room(304, Building.SMC), "Dean Parma", CampusRank.DEAN));
        r.addReservation(new Reservation(new Room(111, Building.OM), "President", CampusRank.PRESIDENT));
        r.addReservation(new Reservation(new Room(111, Building.OM), "True President", CampusRank.STUDENT));
        Map<Room, Reservation> temp = r.reserveRooms();
        System.out.println(r.reserveRooms());
        System.out.println(temp.keySet());
    }
}
