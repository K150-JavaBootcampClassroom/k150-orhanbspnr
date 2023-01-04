public class Company extends Customer{
    public Company(String cName) {
        super(cName);
    }

    // Araç kiralama metotları.
    public void rentCarMonth(Suv suv, int month) {
        System.out.println("Araç " + month + " aylığına kiralandı.");
        suv.calculatePriceMonth(suv,month);
    }
    public void rentCarMonth(Sedan sedan, int month) {
        System.out.println("Araç " + month + " aylığına kiralandı.");
        sedan.calculatePriceMonth(month);
    }
    public void rentCarDaily(Car c, int day){
        System.out.println("Araç " + day + " günlüğüne kiralandı.");
        c.calculatePriceDay(day);
    }
    public void rentCarDaily(Suv s,int day){
        System.out.println("Araç " + day + " günlüğüne kiralandı.");
        s.calculatePriceDay(s,day);

    }

}
