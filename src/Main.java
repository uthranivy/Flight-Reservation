
public class Main {
    public static void main(String[] args) {
        String[] place = {"Park", "Hotel", "Museum", "Movie", "Temple"};
        Flight flight1 = new Flight(121, "Air India", 60, true);
        Flight flight2 = new Flight(237, "Indigo", 100, true);

        Passenger passenger1 = new Passenger(1,"Siva", "8438958943",
                "siva@gmail.com", "North Street",
                "old Delhi", "Delhi");
        Passenger passenger2 = new Passenger(2,"Arun", "9838954943",
                "siva@gmail.com", "Anna Street",
                "Chennai", "TamilNadu");
        Ticket regular = new RegularTicket("145563334", "Delhi",
                "Mumbai", "19/08/21 12:45", "19/08/21 09:30",
                45, 3500.0f, true, flight1, passenger1, "Snack and Water");

        Ticket ticket = new TouristTicket("145322343", "Chennai",
                "Mumbai", "21/08/21 12:45", "21/08/21 09:30",
                45, 3500.0f, true, "ITC Hotel", place, flight2, passenger2);

        regular.printTicketDetails();
        ticket.printTicketDetails();
    }
}
