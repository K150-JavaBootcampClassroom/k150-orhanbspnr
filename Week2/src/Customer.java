public abstract class Customer {
    private String cName;

    // Customer sınıfının parametre alan constructor metodu.
    public Customer(String cName) {
        this.cName = cName;
    }

    // Getter ve Setter Metotları
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }
}
