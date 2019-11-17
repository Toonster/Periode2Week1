public class Garage {
    private String naam;

    public Garage(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String toString() {
        return String.format("Garage: %s\n", naam);
    }
}
