import java.util.ArrayList;

public class ShopManagement implements IShopping {
    // Başlangıçda depoda bulunan meyve miktarları.
    private int appleAmount = 10;
    private int pearAmount = 15;
    private int cherryAmount = 20;

    //Getter ve Setter metotları
    public int getAppleAmount() {
        return appleAmount;
    }

    public void setAppleAmount(int appleAmount) {
        this.appleAmount = appleAmount;
    }

    public int getPearAmount() {
        return pearAmount;
    }

    public void setPearAmount(int pearAmount) {
        this.pearAmount = pearAmount;
    }

    public int getCherryAmount() {
        return cherryAmount;
    }

    public void setCherryAmount(int cherryAmount) {
        this.cherryAmount = cherryAmount;
    }

    // Alışveriş durumlarını kontrol eden metot
    @Override
    public void shopping(Customer customer, FruitType fruitType, int amount) {
        ArrayList<FruitType> shoppingList = new ArrayList<>();
        if (fruitType == FruitType.APPLE) {
            if (amount > getAppleAmount()) {
                System.out.println("Depoda istediğiniz kadar elma yok.");
            } else {
                shoppingList.add(FruitType.APPLE);
                setAppleAmount(getAppleAmount() - amount);
            }
        }
        if (fruitType == FruitType.PEAR) {
            if (amount > getPearAmount()) {
                System.out.println("Depoda istediğiniz kadar armut yok.");
            } else {
                shoppingList.add(FruitType.PEAR);
                setPearAmount(getPearAmount() - amount);

            }
        }
        if (fruitType == FruitType.CHERRY) {
            if (amount > getCherryAmount()) {
                System.out.println("Depoda istediğiniz kadar kiraz yok.");
            } else {
                shoppingList.add(FruitType.CHERRY);
                setCherryAmount(getCherryAmount() - amount);

            }


        }
        // Alışveriş listenin ekrana yazdırılması
        for (FruitType type : shoppingList) {
            System.out.println(type.getType());
        }

    }

    // Depoda kalan meyve miktarlarını gösteren metot
    public void showStore() {
        System.out.println("Depoda kalan elma miktarı = " + getAppleAmount());
        System.out.println("Depoda kalan armut miktarı = " + getPearAmount());
        System.out.println("Depoda kalan kiraz miktarı = " + getCherryAmount());
    }
}
