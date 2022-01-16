/*

 *       *
 * *     *
 *   *   *
 *     * *
 *       *

 */

public class alphabeticpattern153 {

    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        int incrementer = 1;

        for (int i = 0; i < row; i++) {
            System.out.print("* ");
            for (int j = 1; j < column - 1; j++) {
                if (j == incrementer && incrementer < column - 1 && i == incrementer && incrementer < row - 1) {
                    System.out.print("* ");
                    incrementer++;
                } else {
                    System.out.print("  ");
                }
            }


            System.out.println("*");
        }

    }

}
