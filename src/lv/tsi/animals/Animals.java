package lv.tsi.animals;

public class Animals {
    public static void main(String[] args) {
        Cat kitten = new Cat("Garry");
        Dog puppy = new Dog("Jack");
        Fox foxy = new Fox("Red");
        kitten.printName();
        kitten.sound();
        puppy.printName();
        puppy.sound();
        foxy.printColor();
        foxy.sound();
    }
}
