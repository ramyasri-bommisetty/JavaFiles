package SRC.string;

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

        sb.append("World");
        System.out.println(sb);

        String s1 = "hello";
        String s3 =s1.concat("world");
        System.out.println(s3);
    }

}
