package strings;

public class StringMethods {
    public static void main(String[] args) {
        String targetString = "Java is fun to learn";
        String s1 = "JAVA";
        String s2 ="Java";
        String s3 ="  Hello Java ";
        System.out.println("Char at index2(Third Position)is"+" "+targetString.charAt(8));
        System.out.println("Concat the string  "+" "+targetString.concat("-Enjoy-"));
        System.out.println("Checking equals ignoring case"+" "+s2.equalsIgnoreCase(s1)+" "+s2.compareToIgnoreCase(s1));
        System.out.println("Checking equals with case"+" "+s2.equals(s1));
        System.out.println("Checking length"+" "+targetString.length());
        System.out.println("Replace function"+" "+targetString.replace("fun","easy"));
        System.out.println("Substring of target string"+" "+targetString.substring(8));
        System.out.println("SubString of target string"+" "+targetString.substring(8,12));
        System.out.println("converting to lower string"+" "+targetString.toLowerCase());
        System.out.println("converting to upper string"+" "+targetString.toUpperCase());
        System.out.println(s3);
        System.out.println("Trimming string- trims the spaces front and back of the string"+" "+s3.trim());
        System.out.println("Searching s1 in target string"+" "+targetString.contains(s1));
        System.out.println("Searching s1 in target string"+" "+targetString.contains(s2));
        System.out.println("comparing to strings"+" "+s1.compareToIgnoreCase(s2));
        char [] charArray = s2.toCharArray();
        System.out.println("Size of the char array"+" "+charArray.length);
        System.out.println("Printing last element of array: " + charArray[3]);



    }

}
