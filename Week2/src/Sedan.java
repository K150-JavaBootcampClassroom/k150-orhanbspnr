public class Sedan extends Car{
    private int  baggageSize;


    private final int MONTH_PRICE = 9000; // Aylık araç kiralama fiyatı final değişekni.
    public Sedan(int year, String color, int enginePower, int maxSpeed, int baggageSize) {
        super(year, color, enginePower, maxSpeed);
        this.baggageSize = baggageSize;
    }
    // Fiyat Hesaplama metotları
    public void calculatePriceMonth(int month){
        int price = MONTH_PRICE*month;
        System.out.println("Kiralama ücreti = " + price);
    }

    @Override
    public void calculatePriceDay(int day) {

        super.calculatePriceDay(day);
    }

    // Getter ve Setter Metotları

    public int getBaggageSize() {
        return baggageSize;
    }

    public void setBaggageSize(int baggageSize) {
        this.baggageSize = baggageSize;
    }
}
