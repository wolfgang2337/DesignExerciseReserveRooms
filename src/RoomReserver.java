import java.lang.reflect.Array;
import java.util.*;

public class RoomReserver {

    Stack<Reservation> reservationStack;
    List<List<Reservation>> reservationList;

// reservations[RANK_NAME] returns the list of reservations for RANK_NAME

    public RoomReserver() {
        reservationStack = new Stack<>();
        reservationList = new ArrayList<>();
        for(CampusRank rank : CampusRank.values()) {
            reservationList.add(new ArrayList<Reservation>());
        }
    }

    public void addReservation(Reservation r) {
        reservationList.get(r.rank.ordinal()).add(r);
    }

    public Map<Room, Reservation> reserveRooms() {
        boolean tempBool = false;
        Map<Room, Reservation> outputMap = new HashMap();
        for(List<Reservation> l: reservationList) {
            for(Reservation r: l) {
                for(Room room: outputMap.keySet()) {
                    if(room.equals(r.room)) {
                        tempBool = true;
                    }
                }
                if(tempBool) {
                    tempBool = false;
                    continue;
                }
                outputMap.put(r.room, r);
            }
        }
        return outputMap;
    }
}
