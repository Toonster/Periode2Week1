public class Punt {
    protected int x;
    protected int y;

    public Punt() {
    }


    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return String.format("x: %d  y: %d\n", x, y);
    }
}
