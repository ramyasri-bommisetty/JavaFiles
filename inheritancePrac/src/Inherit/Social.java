package Inherit;

public class Social {
    public void amount () {
        System.out.println("This is asserts amount");
    }
    public static void main(String[] args) {

            Mobile m = new Mobile();

            //mobile methods are private
            System.out.println("the mobile data is private");
            System.out.println(" the mobile name is " + m.phoneName());
            Asserts a = new Asserts();
            a.housedoc();
            System.out.println("The car name is " + " " + a.car());
            Streetlight s = new Streetlight();
            s.lights();
            Television t = new Television();
            t.tv();
            Social S = new Television();
            S.amount();
            Social A = new Asserts();
            A.amount();


        }
    }
