public class BuyTicket {
    private Company company;
    private SeatType seatType;
    private SeatNumber seatNumber;
    private FlightType flightType;

    public void buyTicket(Company company, SeatType seatType, FlightType flightType) {
        if (company == Company.THY) {
            ThyTicketCalculation thyTicketCalculation = new ThyTicketCalculation();
            thyTicketCalculation.ticketCalculate(flightType, seatType);

        }
        if (company == Company.PEGASUS) {
            PegasusTicketCalculation pegasusTicketCalculation = new PegasusTicketCalculation();
            pegasusTicketCalculation.ticketCalculate(flightType, seatType);
        }


    }
}
