public class Lion extends Animal {


    public Lion (String name, int age){
        super(name, age, AnimalType.LION);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAR!");
    }

    @Override
    public void feedAnimal() {
        System.out.println("Lions eat meat.");
    }
}
