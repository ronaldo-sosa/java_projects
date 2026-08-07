public abstract class Animal implements Feedable {
    protected String name;
    protected int age;
    protected AnimalType type;

    public Animal(String name, int age, AnimalType type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public abstract void makeSound();

    public void showInfo(){
            System.out.printf("""
                    -------------
                    Name: %s
                    Age: %d
                    Type: %s
                    -------------
                    """,
                   name,
                   age,
                   type);
    }
}
