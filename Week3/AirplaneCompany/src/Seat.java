import java.util.LinkedHashSet;
public class Seat {
    private Customer customer;
    private LinkedHashSet<SeatNumber> seat;

    {
        seat = new LinkedHashSet<>();
        seat.add(SeatNumber.A1);
        seat.add(SeatNumber.A2);
        seat.add(SeatNumber.A3);
        seat.add(SeatNumber.B1);
        seat.add(SeatNumber.B2);
        seat.add(SeatNumber.B3);

    }

    public void selectSeat(SeatNumber seatNumber) {
        System.out.println("Boş Koltuklar :");
        for (SeatNumber seatNum : seat) {
            System.out.println(seatNum.name());
        }
        if (seat.contains(seatNumber)) {
            System.out.println(seatNumber + " nolu koltuk seçildi");
            seat.remove(seatNumber);
        } else {
            System.out.println(seatNumber + " nolu koltuk dolu");
        }
    }

    public Seat(Customer customer) {
        this.customer = customer;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}



