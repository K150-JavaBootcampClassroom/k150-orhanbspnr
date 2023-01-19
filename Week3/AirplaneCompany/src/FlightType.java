public enum FlightType {
    DOMESTIC("Yurt içi"),
    ABROAD("Yurt dışı");

    String type;

    FlightType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
