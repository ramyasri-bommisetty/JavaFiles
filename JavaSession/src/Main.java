// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public void addition(int a,int b){
        System.out.println(a+b);
    }
    public int subraction(int a,int b){
        System.out.println("inside");
        return a-b;
    }

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        Main obj = new Main();
        obj.addition(2,3);
        int sub = obj.subraction(7,6);
        System.out.printf(""+sub);





}
}