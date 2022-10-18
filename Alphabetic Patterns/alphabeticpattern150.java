/*


 *   *
 * *
 *
 * *
 *   *


 */

class alphabeticpattern150 {

    public static void main(String[] args) {
        int row = 5;
        int column = 3;

        for (int i = 0; i < row; i++) {
            System.out.print("* ");
            for (int j = 1; j < column; j++) {
                if (i != 2) {
                    if (j % 2 == 1 && i % 2 == 0) {
                        System.out.print("  ");
                    } else if (j % 2 == 0 && i % 2 == 0 || j % 2 == 1 && i % 2 == 1) {
                        System.out.println("*");
                    }
                } else {
                    System.out.println("");
                    break;
                }
            }
        }
    }
}
