public class Elephant extends Animal {


    public Elephant (String name, int age){
        super(name, age, AnimalType.ELEPHANT);
    }

    @Override
    public void makeSound() {
        System.out.println("WOOOO!");
    }

    @Override
    public void feedAnimal() {
        System.out.println("Elephants eat peanuts.");
    }
}
