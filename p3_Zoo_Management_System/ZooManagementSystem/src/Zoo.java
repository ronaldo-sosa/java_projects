import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo(){
        animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void showAnimals(){
        if (animals.isEmpty()) {
            System.out.println("There are no registered animals.\n");
            return;
        }
        for (Animal animal : animals){
            animal.showInfo();
        }
    }

    public void showAllSounds(){
        if (animals.isEmpty()) {
            System.out.println("There are no registered animals.\n");
            return;
        }
        for (Animal animal : animals){
            animal.makeSound();
        }
    }

    public void feedAnimals(){
        if (animals.isEmpty()) {
            System.out.println("There are no registered animals.\n");
            return;
        }
        for (Animal animal : animals){
            animal.feedAnimal();
            // ((Feedable) animal).feedAnimal(); <- CASTING
        }
    }
}
