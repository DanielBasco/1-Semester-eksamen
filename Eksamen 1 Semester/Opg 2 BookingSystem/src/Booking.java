import java.time.LocalDate;

public class Booking {
    private Room room;
    private User user;
    LocalDate start;
    LocalDate end;


    Booking(Room room, LocalDate start, LocalDate end, User user){
        this.start = start;
        this.end = end;
        this.room = room;
        this.user = user;
    }

    Room getRoom(){
        return room;
    }

    LocalDate getStart(){
        return start;
    }

    LocalDate getEnd(){
        return end;
    }


}
