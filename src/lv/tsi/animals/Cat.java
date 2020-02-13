package lv.tsi.animals;

public class Cat implements Animal, Domestic {

    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void printName() {
        System.out.println("Cat's name is " + name);
    }
}
