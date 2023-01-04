public class Hatchback extends Car{
    private int doorCount;
    public Hatchback(int year, String color, int enginePower, int maxSpeed, int doorCount) {
        super(year, color, enginePower, maxSpeed);
        this.doorCount = doorCount;
    }
    // Getter ve Setter Metotları

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    // Fiyat Hesaplama Metodu.
    @Override
    public void calculatePriceDay(int day) {
        super.calculatePriceDay(day);
    }
}
