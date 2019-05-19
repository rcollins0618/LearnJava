public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        int x;

        Pencil p1 = new Pencil();
        Pencil p2 = new Pencil();
        Pen pen1 = new Pen();

        pen1.setColor("yellow", 2);

        p1.length = 5;
        p2.length = 6;

        x=5;

        p1.setColor("blue");
    }
}
