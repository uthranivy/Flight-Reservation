import java.util.Arrays;

public class TouristTicket extends Ticket {

    private String hotelAddress;
    public String getHotelAddress(){ return hotelAddress;
    }

    private String touristLocation[] = new String[5];
    public String[] getTouristLocation(){
        if(touristLocation.length<=5) {
            return touristLocation;
        }
         String[] change = { "Please Add Maximum of 5 Tourist Place"};
        return change;
    }
    public TouristTicket(String pnrNo, String departure,
                         String destination, String arrivalDateTime,
                         String departureDateTime, int seatNum,
                         float price, boolean cancel, String hotelAddress, String[] touristLocation,
                         Flight flightName, Passenger passenger) {
        super(pnrNo, departure, destination, arrivalDateTime, departureDateTime, seatNum,
                price, cancel, flightName, passenger);
        this.hotelAddress = hotelAddress;
        this.touristLocation =  touristLocation;
    }

    void printTicketDetails()
    {
        System.out.println("PNR Number: " + getPnrNo() + " From: " + getDeparture() +
                            " To: " +getDestination() + " Departure Date & Time: " + getDepartureDateTime() +
                            " Arrival Date & Time: " + getArrivalDateTime() + " Seat No: " + getSeatNum() + " Price: " + getPrice() );
        System.out.println("Passenger Details : " + passenger.getAddressDetails()+ " Passenger Address : "+ passenger.getContactDetails());
        System.out.println("Tourist Location: " + Arrays.toString(getTouristLocation()));
    }


}
