public class Dog extends Animal {
    private String name;


    // Constructor
    public Dog() {

    }
    // Override the Animal methods

    public void eat() {
        System.out.println("chawk chawk");
    }

    public void sleep() {
        System.out.println("ZZZ");
    }
    // Getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
