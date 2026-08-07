import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("""
                ======================
                    ZOO MANAGEMENT
                ======================
                
                Choose an option:
                
                1. Add a lion
                2. Add an elephant
                3. Add a monkey
                4. Show all animals
                5. Feed all animals
                6. Show all sounds
                7. Exit system
                Option: 
                """);

            int option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1:{
                    System.out.println("Write the lion's data:");

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    zoo.addAnimal(new Lion(name, age));
                    System.out.printf("%s added successfully.%n", name);

                    break;
                }
                case 2: {
                    System.out.println("Write the elephant's data:");

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    zoo.addAnimal(new Elephant(name, age));
                    System.out.printf("%s added successfully.%n", name);


                    break;
                }
                case 3: {
                    System.out.println("Write the monkey's data:");

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    zoo.addAnimal(new Monkey(name, age));
                    System.out.printf("%s added successfully.%n", name);


                    break;
                }
                case 4: {
                    zoo.showAnimals();

                    break;
                }

                case 5: {
                    zoo.feedAnimals();
                    break;
                }

                case 6: {
                    zoo.showAllSounds();
                    break;
                }

                case 7: {
                    running = false;
                    System.out.println("Closing system.");
                    break;
                }

                default: {
                    System.out.println("Invalid option.");
                    break;
                }
            }
        }
        scanner.close();
    }
}
