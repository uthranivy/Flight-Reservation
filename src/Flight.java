public class Flight {

    int flightNum;
    String airlineName;
    int capacity;
    boolean seatbooked;

    public Flight(int flightNum, String airlineName, int capacity, boolean seatbooked) {
        this.flightNum = flightNum;
        this.airlineName = airlineName;
        this.capacity = capacity;
        this.seatbooked = seatbooked;
    }


    public boolean checkSeatAvailable(){
        return seatbooked;
    }
    public void updateSeatBooked(){
        this.seatbooked = true;
    }


}
