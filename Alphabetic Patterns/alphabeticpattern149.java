/*

 * * * * *
     *
     *
     *
 * * *


 */

class alphabeticpattern149 {

    public static void main(String[] args) {
        int row = 5;
        int column = 5;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0) {
                    System.out.print("* ");
                } else if (i == row - 1) {
                    if (j <= column / 2) {
                        System.out.print("* ");
                    }
                } else {
                    if (j == column / 2 && j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
