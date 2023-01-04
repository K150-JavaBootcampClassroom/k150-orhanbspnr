public class Suv extends Car{
    private String wheelDrive;

    private final int DAILY_PRICE = 330; // Günlük araç kiralama fiyatı final değişkeni.
    private final int MONTH_PRICE = 9000; // Aylık araç kiralama fiyatı final değişkeni.


    public Suv(int year, String color, int enginePower, int maxSpeed, String wheelDrive) {
        super(year, color, enginePower, maxSpeed);
        this.wheelDrive = wheelDrive;
    }

    // Fiyat Hesaplama metotları.
    public void calculatePriceMonth(Suv suv,int month) {
        int price = MONTH_PRICE*month;
        double multiple = 1.2;
        if(suv.getYear() > 2015){
            price*= multiple;
        }
        System.out.println("Kiralama Ücreti = " + price);
    }
    public void calculatePriceDay(Suv suv,int day){
        int price = DAILY_PRICE*day;
        double multiple = 1.2;
        if(suv.getYear() > 2015){
            price*= multiple;
        }
        System.out.println("Kiralama ücreti = " + price);
    }

    // Getter ve Setter Metotları

    public String getWheelDrive() {

        return wheelDrive;
    }

    public void setWheelDrive(String wheelDrive) {

        this.wheelDrive = wheelDrive;
    }
}
