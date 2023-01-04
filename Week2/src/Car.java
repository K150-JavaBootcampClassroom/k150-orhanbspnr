public abstract class Car {
    int year;
    String color;
    int enginePower;
    int maxSpeed;

    // Car sınıfının parametre alan constructor metodu.
    public Car(int year, String color, int enginePower, int maxSpeed) {
        this.year = year;
        this.color = color;
        this.enginePower = enginePower;
        this.maxSpeed = maxSpeed;
    }

    // Getter ve Setter Metotları.
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    // Fiyat hesaplama metotları.
    public void calculatePriceMonth(int month){
        int price = 8000*month;
        System.out.println("Kiralama ücreti = " + price);
    }

    public void calculatePriceDay(int day){
        int price = 330*day;
        System.out.println("Kiralama ücreti = " + price);
    }
}

