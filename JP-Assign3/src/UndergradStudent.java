public class UndergradStudent extends Person implements Student {

    public UndergradStudent(String n, int i) {
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
        System.out.println("Cheers, Undergrad Student graduated!");
    }

    @Override
    public void Register() {
        System.out.println("Undergrad Student has registered!");
    }

    @Override
    public void ChangeMajor() {
        System.out.println("Undergrad Student changed major!");
    }
}
