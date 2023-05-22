public class Dog extends Animal {
    private String name;


    // Override the Animal methods
    @Override
    public void eat() {
        System.out.println("Yummy yum");
    }
    @Override
    public void sleep() {
        System.out.println("Pshht");
    }
    // constructor
    public Dog(){}

    public Dog(String ration, String color, int weight, String name){
        super(ration,color,weight);
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
        return "name of dog: " + name +
                ", food: " + getRation() +
                ", color: " + getColor() +
                ", weight: " + getWeight();
    }
}
