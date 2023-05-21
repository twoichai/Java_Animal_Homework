public class Cat extends Animal {
    private String name;


    // Override the Animal methods
    public void eat() {
        System.out.println("Yummy yum");
    }
    public void sleep() {
        System.out.println("Pshht");
    }
    // constructor
    public Cat(){}

    public Cat(String ration, String color, int weight, String name){
        super();
        this.name = name;
    }
    // getter & setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
