package lv.tsi.animals;

public class Fox implements Animal, Wild {

    public String color;

    public Fox(String color) {
        this.color = color;
    }

    @Override
    public void sound() {
        System.out.println("Wa-pow");
    }

    @Override
    public void printColor() {
        System.out.println("Fox's color is " + color);
    }
}
