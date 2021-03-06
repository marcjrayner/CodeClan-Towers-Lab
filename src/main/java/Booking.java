public class Booking {

    private Bedroom room;
    private int numberOfNights;

    public Booking(Bedroom bedroom, int numberOfNights){
        this.room = bedroom;
        bedroom.bookSelf();
        this.numberOfNights = numberOfNights;
    }

    public Bedroom checkBedroom() {
        return this.room;
    }

    public int checkNights() {
        return this.numberOfNights;
    }

    public int calculateTotalCost() {
        return numberOfNights * this.room.rateOfRoom();
    }


}
