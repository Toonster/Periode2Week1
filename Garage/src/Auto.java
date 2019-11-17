public class Auto {
    private String merknaam;
    private Garage garage;

    public Auto(String merknaam, Garage garage) {
        this.merknaam = merknaam;
        this.garage = garage;
    }

    public Auto(String merknaam) {
        this(merknaam, null);
    }

    public Auto(Auto auto) {
        this(auto.merknaam, auto.garage);
    }

    public String getMerknaam() {
        return merknaam;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public String toString() {
        return String.format("Auto: %s Garage: %s\n", merknaam, garage.getNaam());
    }
}
