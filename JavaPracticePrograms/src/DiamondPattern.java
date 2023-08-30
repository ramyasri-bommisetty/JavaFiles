  public class DiamondPattern {
    public static void main(String[] args) {
        int rows = 7;
        int spaces = rows / 2;
        int stars = 1;

        for (int i = 1; i <= (rows + 1) / 2; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }

            System.out.println();
            spaces--;
            stars += 2;

        }
        spaces = 1;
        stars = rows - 2;

        for (int i = 1; i <= rows / 2; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }

            System.out.println();
            spaces++;
            stars -= 2;
        }
    }
  }

