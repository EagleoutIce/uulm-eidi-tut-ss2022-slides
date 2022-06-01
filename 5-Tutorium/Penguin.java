public class Penguin {
    private final int age;
    final String name;

    public Penguin(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " watschelt seit " + age + " Jahr(en)";
    }
}