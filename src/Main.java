public class Main {
    public static void main(String[] args) {

        Animal basicAnimal = new Animal();
        basicAnimal.eat();

        Dog basicDog = new Dog();
        basicDog.eat();
        basicDog.sleep();

        Cat basicCat = new Cat("fish", "black", 2, "Peter");
        basicCat.sleep();
    }
}
// ToDo: why I don't need "Override" for the methods?