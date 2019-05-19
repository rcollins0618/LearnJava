public class PassRef {
    public static void main(String[] args) {
        Pencil plainPencil = new Pencil("PLAIN");
        System.out.println("original color: " + plainPencil.getColor());

        paintRed(plainPencil);

        System.out.println("new color: " + plainPencil.getColor());
    }

    public static void paintRed(Pencil p) {
        p.setColor("RED");
        //p = null;
    }
}

