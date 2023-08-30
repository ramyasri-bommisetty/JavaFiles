package SRC.MethodOverLoadingOverRidding;

public class Bank {
    public static void main(String[] args) {
        RBI r = new RBI();
        System.out.println("RBI interest rate is "+" "+r.InterestRate());
        SBI s = new SBI();
        System.out.println("SBI interest rate is "+" "+s.InterestRate());
        Axis a = new Axis();
        System.out.println("Axis interest rate is "+" "+a.InterestRate());
        Icic i = new Icic();
        System.out.println("Icic interest rate is "+" "+i.InterestRate());
    }
}
