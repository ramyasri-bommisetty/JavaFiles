package usage;

import Inherit.Asserts;
import Inherit.Social;
import Inherit.Streetlight;

public class Person extends Social {
    public static void main(String[] args) {
        Asserts a = new Asserts();
        System.out.println("The new car is"+" "+a.car());
        Streetlight s = new Streetlight();
        s.lights();
        s.amount();

    }

}
