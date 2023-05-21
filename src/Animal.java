// parent class

public class Animal {
    //vars
    private String ration;
    private String color;
    private int weight;

    // constructors
    public Animal() {
    }

    public Animal(String ration, String color, int weight) {
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    // methods from the task
    public String getVoice(String voice) {
        return voice;
    }

    public void eat() {
        System.out.println("yum yum");
    }

    public void sleep() {
        System.out.println("Zzzzzzz...");
    }

    // getter and setter

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // toString
    @Override
    public String toString() {
        return  "food: " + getRation() +
                ", color: " + getColor() +
                ", weight: " + getWeight();
    }

}
