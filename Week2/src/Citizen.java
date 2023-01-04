public class Citizen extends Customer {


    public Citizen(String cName) {
        super(cName);
    }

    // Günlük araç kiralama metodu.
    public void rentCarDaily(Hatchback h, int day) {
        System.out.println("Araç " + day + " günlüğüne kiralandı.");
        h.calculatePriceDay(day);

    }


}

