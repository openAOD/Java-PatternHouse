/**
 * Pattern101
 *     5
      444
     33333
    2222222
   111111111
 * 
 */
class numericpattern101 {
    public static void main(String[] args) {
        int rows = 5;
        int temp = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print(temp);
            }
            System.out.println();
            temp--;
        }
    }
}
