public class Person {
    private String name;

    public Person() {
        name = "no_name_yet";
        System.out.println("Person constructor running.");
    }

    public Person(String initialName) {
        this.name = initialName;
        System.out.println("Person constructor with name assignment running.");
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}
