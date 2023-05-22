public class Cat extends Animal {
    private String name;

    // constructor
    public Cat(){}

    public Cat(String ration, String color, int weight, String name){
        super(ration,color,weight);
        this.name = name;
    }
    // Override the Animal methods
    @Override
    public void eat() {
        System.out.println("Yummy yum");
    }
    @Override
    public void sleep() {
        System.out.println("Pshht");
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
        return "name of cat: " + name +
                ", food: " + getRation() +
                ", color: " + getColor() +
                ", weight: " + getWeight();
    }
}
