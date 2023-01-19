public class ThyTicketCalculation extends AbstractTicketCalculation {

    @Override
    public void ticketCalculate(FlightType flightType, SeatType seatType) {
        System.out.println("THY");
        if (seatType == SeatType.ECONONOMY) {
            System.out.println("Ekonomi sınıfı bilet seçildi.");

        } else if (seatType == SeatType.BUSINESS) {
            System.out.println("Business sınıfı bilet seçildi.");

        }

        System.out.println("Tüm biletler için yemek hizmeti verilmektedir.");
        if (flightType == FlightType.DOMESTIC) {
            System.out.println("Yurt içi uçuş seçildi.");
        } else if (flightType == FlightType.ABROAD) {
            System.out.println("Yurt dışı uçuş seçildi.");
        }
    }

}
