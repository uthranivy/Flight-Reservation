import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

abstract class Ticket {

    Flight flightName;
    Passenger passenger;
    private boolean cancel;
    private  int seatNum;
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private float price;

    public String getPnrNo() {
        return pnrNo;
    }

    public void setPnrNo(String pnrNo) {
        this.pnrNo = pnrNo;
    }

    private String pnrNo;

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    private String departure;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    private String destination;

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    private String arrivalDateTime;

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    private String departureDateTime;

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }


    public Ticket(String pnrNo, String departure, String destination,
                  String arrivalDateTime, String departureDateTime, int seatNum,
                  float price, boolean cancel, Flight flightName, Passenger passenger) {
        this.flightName = flightName;
        this.passenger = passenger;
        this.pnrNo = pnrNo;
        this.departure = departure;
        this.destination = destination;
        this.arrivalDateTime = arrivalDateTime;
        this.departureDateTime = departureDateTime;
        this.seatNum = seatNum;
        this.price = price;
        this.cancel = cancel;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    private static void getFlightDuration(String departureDateTime, String arrivalDateTime) {
      SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        try {
            Date date1 = obj.parse(departureDateTime);
            Date date2 = obj.parse(arrivalDateTime);
            long duration = date2.getTime() - date1.getTime();
            long days = (duration / (1000*60*60*24)) % 365;
            long minutes = (duration / (1000*60)) % 60;
            long hours = (duration / (1000*60*60)) % 24;
            System.out.println(hours + " hours, " + minutes  + " minutes, "
                                       +  days + " days"  );
        }
        catch (ParseException except) {
            except.printStackTrace();
        }
   }

    public boolean ticketAvailable() {
        return cancel;
    }

    public void confirmed(){
            this.cancel = false;
        }
    public void cancelled() {
        this.cancel = true;
    }
    abstract void printTicketDetails();
}
