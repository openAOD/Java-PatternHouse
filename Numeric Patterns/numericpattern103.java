/**
 * 
 * pattern to be printed 
 * 
 *         5
 *       6 5 4
 *     7 6 5 4 3
 *   8 7 6 5 4 3 2
 * 9 8 7 6 5 4 3 2 1
 * 
 * numericpattern103
 */
public class numericpattern103 {

    public static void main(String[] args) {

        int rows = 5;
       numericPattern103(rows);
    }

    private static void numericPattern103(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j =i; j <=n ; j++) {
                System.out.print((2*n-j) + " ");
            }
            for (int j =i+1; j <=n ; j++) {
                System.out.print((n+i-j) + " ");
            }
            System.out.println();
        }

    }

   
}

