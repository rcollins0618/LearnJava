public class Tetra extends Dino{
    private int legs;

    Tetra() {
        super.setName("Tetrasaur");
    }

    Tetra(String n, int l) {
        super(n);
        legs = l;
    }

    public void setLegs(int l) {
        legs = l;
    }
    public int getLegs() {
        return legs;
    }
}
