public class Fibonacci {
    public static void main(String[] args) {
        int n1 =0,n2=1,n3=0,i,count =7;
        System.out.println(n1+ " "+n2);
        for(i=2;i<count;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3);
        }

    }
}
