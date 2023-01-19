public enum SeatType {
    BUSINESS("Business"),
    ECONONOMY("Economy");

    String type;

    SeatType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
