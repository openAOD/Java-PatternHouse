/**
 * Pattern94
        1 
       1 2 
      1 2 3 
     1 2 3 4 
    1 2 3 4 5
 */
class numericpattern94 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    
}
