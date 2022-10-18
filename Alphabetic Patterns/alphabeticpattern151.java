/*

 *
 *
 *
 *
 * * *

 */


class alphabeticpattern151 {

    public static void main(String[] args) {
        int row = 5;
        int column = 3;
        for (int i = 1; i <= row; i++) {
            if (i == row) {
                for (int j = 1; j < column; j++) {
                    System.out.print("* ");
                }
                System.out.println("*");
            } else {
                System.out.println("*");
            }
        }
    }
}
