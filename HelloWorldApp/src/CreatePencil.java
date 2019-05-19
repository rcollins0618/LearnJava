public class CreatePencil {
    public static void main(String[] args) {
        Pencil p1 = new Pencil();
        // Pencil.nextID++;
        System.out.println(p1.nextID + ", color: " + p1.getColor());
        // Result: 1

        Pencil p2 = new Pencil("Green");
        // Pencil.nextID++;
        System.out.println(p2.nextID+ ", color: " + p2.getColor());
        // Result: 2

        System.out.println("There are " + p1.nextID + " pencils");
        // Result: Still 2
    }
}
