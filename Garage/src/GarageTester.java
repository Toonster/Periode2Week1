public class GarageTester {
    public static void main(String[] args) {
        Auto auto = new Auto("Ford S - MAX");
        Garage garage = new Garage("Neyt");
        auto.setGarage(garage);
        System.out.println(auto);  // impliciete oproep toString
        auto = new Auto("Ford Focus", garage);
        System.out.println(auto);  // impliete oproep toString
        auto = new Auto("Mercedes C", new Garage("Van Winkel"));
        System.out.println(auto);  // impliciete oproep toString
        Auto kopie = new Auto(auto);
        System.out.println(kopie);  // impliciete oproep toString
    }
}
