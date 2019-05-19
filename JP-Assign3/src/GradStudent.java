public class GradStudent extends Person implements Student {

    public GradStudent(String n, int i) {
        super(n,i);
    }

    public void Graduate() {
        System.out.println("Cheers, GradStudent graduated!");
    }

    public void Register() {
        System.out.println("Grad Student has registered!");
    }

    public void ChangeMajor() {
        System.out.println("Grad Student changed major!");
    }

    @Override
    public String toString() {
        return super.getName();
    }

    @Override
    public void Grow() {
        // TODO Grow Method stub
    }
}
