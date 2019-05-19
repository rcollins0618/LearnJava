public class Pencil {
    private String color;
    public int length;
    public float diameter;
    public static long nextID = 0;

    public Pencil() {
        color = "Red";
        nextID++;
    }
    public Pencil(String myColor) {
        this();
        color = myColor;
    }

    public void setColor(String myColor, int x) {
        color = myColor;
        length = x;
    }
    public void setColor(String myColor) {
        color = myColor;
    }

    public String getColor() {
        return color;
    }
}
