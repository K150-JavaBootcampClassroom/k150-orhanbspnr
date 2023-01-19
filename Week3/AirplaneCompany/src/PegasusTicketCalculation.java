public class PegasusTicketCalculation extends AbstractTicketCalculation {

    @Override
    public void ticketCalculate(FlightType flightType, SeatType seatType) {
        System.out.println("Pegasus");
        if (seatType == SeatType.ECONONOMY) {
            System.out.println("Ekonomi sınıfı bilet seçildi.");
        } else if (seatType == SeatType.BUSINESS) {
            System.out.println("Business sınıfı bilet seçildi.");
        }

        if (flightType == FlightType.DOMESTIC) {
            System.out.println("Yurt içi uçuş seçildi");
            System.out.println("Yurt içi biletler için yemek hizmeti yoktur.");
        } else if (flightType == FlightType.ABROAD) {
            System.out.println("Yurt dışı bilet seçildi.");
            System.out.println("Yurt dışı biletler için yemek hizmeti verilmektedir.");

        }
    }
}
