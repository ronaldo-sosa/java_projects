public class Monkey extends Animal {


    public Monkey (String name, int age){
        super(name, age, AnimalType.MONKEY);
    }

    @Override
    public void makeSound() {
        System.out.println("U A A A!");
    }

    @Override
    public void feedAnimal() {
        System.out.println("Monkeys eat bananas. They never cramp.");
    }
}
