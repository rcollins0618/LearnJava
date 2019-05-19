abstract class Person {

    // Some data about a person
    String name;
    int ID;

    // default constructor
    Person() {
        name = "No Name";
        ID = 0;
        System.out.println("I am a Person");
    }
    // another constructor to set name and ID
    Person(String n, int i) {
        name = n;
        ID = i;
    }

    String getName() {
        return name;
    }
    void setName(String n) {
        name = n;
    }

    int getID() {
        return ID;
    }
    void setID(int i) {
        ID = i;
    }

    public abstract void Grow();

    // Overrides java.lang.Object.toString
    public abstract String toString();
}
