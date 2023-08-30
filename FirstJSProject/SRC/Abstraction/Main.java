package SRC.Abstraction;

public class Main {

    public static void main(String[] args) {
         Cat c = new Cat();
         c.sound();
         c.sleep();

        Pig p = new Pig();
        p.run();
        p.sound();

        FoodInterface ps = new Pig();
        ps.sound();

        AnimalInterface as = new Pig();
        as.sound();

        AnimalInterface ad = new Fish();
        ad.sound();


    }
}
