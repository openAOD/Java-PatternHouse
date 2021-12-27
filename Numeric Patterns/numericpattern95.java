/**
 * Pattern95
 *    5 5 5 5 5 
       4 4 4 4 
        3 3 3 
         2 2 
          1 
 */
class numericpattern95 {
    public static void main(String[] args) {
        int rows = 5;
        int temp = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows - i + 1; k++) {
                System.out.print(temp + " ");
            }
            System.out.println();
            temp--;
        }
    }
}
