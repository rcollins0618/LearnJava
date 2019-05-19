public class MedStudent extends Person implements Student {

    public MedStudent(String n, int i) {
        super(n,i);
    }

    @Override
    public void Grow() {

    }

    @Override
    public String toString() {
        return super.getName();
    }

    @Override
    public void Graduate() {
        System.out.println("Cheers, Med Student graduated!");
    }

    @Override
    public void Register() {
        System.out.println("Med Student has registered!");
    }

    @Override
    public void ChangeMajor() {
        System.out.println("Med Student changed major!");
    }
}
