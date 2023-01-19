public enum SeatNumber {
    A1("A1"),
    A2("A2"),
    A3("A3"),
    B1("B1"),
    B2("B2"),
    B3("B3");

    String type;

    SeatNumber(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
