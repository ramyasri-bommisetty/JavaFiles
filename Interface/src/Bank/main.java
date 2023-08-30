package Bank;

public class main implements SBI {
    @Override
    public void checkingAccount() {
        System.out.println("checking account");

    }

    @Override
    public void savingAccount() {
        System.out.println("checking account");

    }

    public static void main(String[] args) {
        main m = new main();
        m.checkingAccount();
        m.savingAccount();
    }
}
