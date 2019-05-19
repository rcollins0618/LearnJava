public class Dino {
    private String name;
    private int age;

    Dino() {
        name = "";
        age = 0;
    }

    Dino(String dName) {
        this();
        name = dName;
    }

    public void setName(String dName) {
        name = dName;
    }
    public String getName() {
        return name;
    }
    public void setAge(int dAge) {
        age = dAge;
    }
    public int getAge() {
        return age;
    }
}
