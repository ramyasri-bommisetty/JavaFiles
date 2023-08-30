package SRC.MethodOverLoadingOverRidding;

public class Ecommerece {
    public void paymentMethod(int COD) {
        System.out.println("This is cash on delivery"+" "+COD);

    }

    public void paymentMethod(float netBanking) {
        System.out.println("This is Net Banking"+" "+netBanking);
    }

    public void paymentMethod(int creditCard, int date) {
        System.out.println("This is credit card"+" "+creditCard);

    }


    public static void main(String[] args) {

        Ecommerece E = new Ecommerece();
        E.paymentMethod(890);
        E.paymentMethod(9.8f);
        E.paymentMethod(78785348,987);

    }
}