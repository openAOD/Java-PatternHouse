/*   * * *
     *   *
     * * *
     *
     *      */

public class alphabeticpattern155 {
    public static void main(String[] args) {
        int row = 5;
        int column = 3;
        for (int i = 0; i < row; i++) {
            System.out.print("* ");
            if (i < 3) {
                if (i % 2 == 0) {
                    for (int j = 1; j < column; j++) {
                        if (j == column - 1) {
                            System.out.println("* ");
                        } else {
                            System.out.print("* ");
                        }
                    }
                } else {
                    System.out.println("  *");
                }
            } else {
                System.out.println("");
            }
        }
    }
}
