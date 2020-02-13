package lv.tsi.animals;

public class Dog implements Animal, Domestic {

    public String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("Bark");
    }

    @Override
    public void printName() {
        System.out.println("Dog's name is " + name);
    }
}
