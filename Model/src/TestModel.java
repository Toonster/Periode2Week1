public class TestModel {
    public static void main(String[] args) {
        Model eerste = new Model("Caroline");
        System.out.println("\nEerste model");
        System.out.println(eerste);
        Model tweede = new Model("Veronica", 102, 67, 88);
        tweede.setAdres("Nationalestraat 5", 2000, "Antwerpen");
        System.out.println("\nTweede model");
        System.out.println(tweede);
    }
}
