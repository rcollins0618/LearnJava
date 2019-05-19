public class Main {
    public static void main (String[] args) {
        Dino dino1 = new Dino("Dino 1");
        Tetra dino2 = new Tetra();
        Tetra dino3 = new Tetra("Bob",4);

        System.out.println(dino1.getName());
        System.out.println(dino2.getName());
        System.out.println(dino3.getName());

        Dino dino4 = (Dino) dino3;
        dino4.setAge(33);

        System.out.println(dino3.getLegs() + ", " + dino3.getAge());
        System.out.println(dino4.getName() + ", " + dino4.getAge());
    }
}
