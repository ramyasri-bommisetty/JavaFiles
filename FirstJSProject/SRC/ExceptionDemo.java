package SRC;

public class ExceptionDemo {

    public static void main(String[] args) {
        int i=10; int j=0;
        try {
            int x = i / j;
        }catch (NullPointerException ex){
            System.out.println("exception");
        }catch (ArithmeticException e){
            System.out.println("exception2");
        }

    }
}
