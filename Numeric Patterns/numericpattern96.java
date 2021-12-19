/**
 * Pattern96
 *    5 4 3 2 1 
       4 3 2 1 
        3 2 1 
         2 1 
          1 
 */
class numericpattern96 {
    public static void main(String[] args) {
        int rows = 5;
        int temp = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = temp; k>=1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
            temp--;
        }
    }
}
