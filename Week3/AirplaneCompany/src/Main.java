
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("name1", "surname1", "0500 000 00 00");
        Seat seat = new Seat(customer1);
        BuyTicket buyTicket = new BuyTicket();
        buyTicket.buyTicket(Company.THY, SeatType.BUSINESS, FlightType.ABROAD);
        seat.selectSeat(SeatNumber.A1);
        seat.selectSeat(SeatNumber.A2);
        seat.selectSeat(SeatNumber.B3);







    }
}