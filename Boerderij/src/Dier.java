public class Dier {
    private String naam;
    private String geluid;
    private String voeding;

    public Dier(String naam, String geluid, String voeding) {
        this.naam = naam;
        this.geluid = geluid;
        this.voeding = voeding;
    }

    public String getNaam() {
        return naam;
    }

    public String getGeluid() {
        return geluid;
    }

    public String getVoeding() {
        return voeding;
    }

    public String toString() {
        return String.format("%s maakt geluid \"%s\" en eet %s\n", naam, geluid, voeding);
    }
}
