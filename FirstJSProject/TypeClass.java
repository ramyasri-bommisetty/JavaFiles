public class TypeClass {
    private static int d;

    public static void main(String[] args) {
        // Twos concepts in type casting: widening and narrowing
        //widening byte->short->int->long->float->double
        //narrowing:other ways for narrowing we should give it explictly
        // java supports widening
        int x=10;
        long y =x;
        float z = y;
        double d =7.8;
        //This is we are narrowing so we have to explictly declare
        x=(int)d;
        y = (long) d;

        System.out.println(x+" "+y);

    }
}
