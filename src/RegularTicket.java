public class RegularTicket extends Ticket{

    private String specialService;
    public String getSpecialService() {
        return specialService;
    }

    public void updateSpecialService(String specialService) {
        this.specialService = specialService;
    }

    public RegularTicket(String pnrNo, String departure, String destination,
                         String arrivalDateTime, String departureDateTime,
                         int seatNum, float price, boolean cancel, Flight flightName,
                         Passenger passenger, String specialService) {
        super(pnrNo, departure, destination, arrivalDateTime, departureDateTime,
                seatNum, price, cancel, flightName, passenger);
        this.specialService = specialService;
    }

    void printTicketDetails() {
        System.out.println("PNR Number: " + getPnrNo() + " From: " + getDeparture() +
                " To: " +getDestination() + " Departure Date & Time: " + getDepartureDateTime() +
                " Arrival Date & Time: " + getArrivalDateTime() + " Seat No: " + getSeatNum() + " Price: " + getPrice() );
        System.out.println("Passenger Details : " + passenger.getAddressDetails()+ " Passenger Address : "+ passenger.getContactDetails());
        System.out.println("Airline: " + flightName.airlineName + "" );
    }
}
