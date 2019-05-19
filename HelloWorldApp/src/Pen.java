public class Pen {
    private String color = "blue";
    public int length;
    public float diameter;
    public static long nextID = 0;

    public void setColor(String myColor, int x){
        color = myColor;
        length = x;
    }

    public String getColor(){
        return color;
    }
}
