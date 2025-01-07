import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


    public class BookingSystem {
        ArrayList<Booking> addBooking = new ArrayList<>();
        ArrayList<Room> rooms = new ArrayList<>();

        public static void main(String[] args) {
            BookingSystem bs = new BookingSystem();


            //Gør det nemmere at anvende LocalDate
            LocalDate today = LocalDate.now();
            LocalDate oneDay = today.plusDays(1);
            LocalDate oneWeek = today.plusWeeks(1);


            //Opretter en person
            User Peter = new User("Peter");
            User Valdemar = new User("Valdemar");

            //Oprettelse af rum
            Room e10 = new Room("E10", 30);
            Room d4 = new Room("D4", 32);
            bs.rooms.add(e10);
            bs.rooms.add(d4);


            //Får Peter til at booke et rum i en dag
            Booking peterBook1 = bs.book(e10, today, oneDay, Peter);

            //Tjekker om rum e10 er tilgængelig fra i dag til i morgen
            if (bs.isAvailable(e10, today, oneDay)) {
                System.out.println("tilgængeligt");
            } else {
                System.out.println("utilgængeligt");
                ;
            }


            // Fjerner Booking
            bs.cancel(peterBook1);

            //Tjekker om rum d4 er tilgængeligt fra i dag til i morgen
            if (bs.isAvailable(d4, today, oneDay)) System.out.println("tilgængeligt");
            else {
                System.out.println("utilgængeligt"); }


            // Finder ledige rum med kapacitet 31 fra i dag til en uge
            List<Room> availableRooms = bs.findAvailable(31, today, oneWeek);
            if (availableRooms.isEmpty()) {
                System.out.println("Ingen ledige rum");
            } else {
                System.out.println("Ledige rum fra " + today + " til " + oneWeek + ":");
                for (Room room : availableRooms) {
                    System.out.println(room.getName()+" med en kapacitet på "+room.getCapacity());
                }
            }
        }

        public boolean isAvailable(Room room, LocalDate start, LocalDate end) {
            for (Booking bookings : addBooking) {

                //Tjekker om det rum der iterere er det samme rum i bookinglisten
                if (bookings.getRoom().equals(room)) {
                    //Tjekker om det indtastede start er efter rummets aktuelle slutdato og indtastede slut er efter dets start.
                    if (start.isBefore(bookings.getEnd()) && end.isAfter(bookings.getStart())) {
                        return false;
                    }

                }
            }
            return true;
        }

        public List<Room> findAvailable(int capacity, LocalDate start, LocalDate end) {
            List<Room> availableRooms = new ArrayList<>();
            for (Room room : rooms) {
                //Hvis det rum i listen har den kapacitet eller mere end det indtastede og rumemt er ledigt, tilføj
                if (room.getCapacity() >= capacity && isAvailable(room, start, end)) {
                    availableRooms.add(room);
                }
            }
            return availableRooms;
        }

        public Booking book(Room room, LocalDate start, LocalDate end, User user) {
            if (isAvailable(room, start, end)) {
                Booking booking = new Booking(room, start, end, user);
                addBooking.add(booking);

                System.out.println(user.getName() + " du har nu booket rum: " + room.getName() + " fra " + start + " til " + end);
                return booking;
            } else {
                System.out.println("Rum " + room.getName() + " er ikke tilgængeligt " + user.getName());
                return null;
            }
        }


        public void cancel(Booking booking) {
            if (addBooking.remove(booking)) {
                System.out.println("Booking er nu fjernet");
            } else {
                System.out.println("Booking blev ikke fundet");
            }
        }

    }