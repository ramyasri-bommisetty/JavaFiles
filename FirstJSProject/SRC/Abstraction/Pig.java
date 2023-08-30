package SRC.Abstraction;

public class Pig implements AnimalInterface, FoodInterface{
    @Override
    public void sound() {
        System.out.print("Mew");
    }

    @Override
    public void run() {
        System.out.print("xxxx");
    }

    @Override
    public void foodType() {

    }
}
