public class StudentDriver {
    public static void main (String args[]) {
        Student ralph = new Student();
        ralph.setName("Ralph");
        System.out.println(ralph.getName());

        Student jane = new Student("Jane");
        System.out.println(jane.getName());

        Student john = new Student("John", 2205628510L);
        System.out.println(john.getName());
        System.out.println(john.getStudentNumber());
    }
}
