public class WhileLoop {
    public static void main(String[] args) {
        int i =1;
        while(i<=20){
            if(i==5){
                i++;
                System.out.println(i);
                continue;
            }
            System.out.println(i);
            i++;
        }


        System.out.println("outside");
        do{
            System.out.println(i);
            i++;
        }while(i<=20);
    }
}
