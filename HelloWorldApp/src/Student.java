public class Student extends Person {
    private long studentNumber;

    public Student() {
        // super(); // runs by default.
        studentNumber = 0L;
    }
    public Student (String initialName) {
        super(initialName); // Needs run, otherwise just runs super().
        studentNumber = 0L;
    }
    public Student (String initialName, long initialStudentNumber) {
        super(initialName);
        studentNumber = initialStudentNumber;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long newStudentNumber) {
        studentNumber = newStudentNumber;
    }
}
