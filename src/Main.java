public class Main {
    public static void main(String[] args) {

        Animal basicAnimal = new Animal();
        basicAnimal.eat();

        Dog basicDog = new Dog("meat", "orange", 5, "John");
        basicDog.eat();
        basicDog.sleep();

        Cat basicCat = new Cat("fish", "black", 2, "Peter");
        basicCat.sleep();

        Vet dr1 = new Vet("Dr. Vetvet");
        dr1.treatment(basicDog);
        System.out.println();
        System.out.println(basicCat.getColor());

        System.out.println(basicCat.toString());
    }
}
