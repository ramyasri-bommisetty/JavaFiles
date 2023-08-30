public class RhombusPrintingStar {
    public static void main(String[] args) {
        int number = 7;

        int m, n;

        for (m = 1; m <= number; m++) {
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();
        }

        // Outer loop 2
        // Prints the second half diamond
        for (m = number - 1; m > 0; m--) {
            }
        for (n = 1; n <= number - m; n++) {
            System.out.print(" ");


        // Inner loop 2 print star
        for (n = 1; n <= m * 2 - 1; n++) {
            System.out.print("*");
        }

        // Ending line after each row
        System.out.println();
        }
    }
}
