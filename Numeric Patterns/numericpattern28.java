/**
 * pattern to be printed 
 * 
 *   5
 *   5 4 
 *   5 4 3
 *   5 4 3 2
 *   5 4 3 2 1
 * numericpattern28
 * 
 */
class numericpattern28{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
              System.out.print(n-j+" ");
            }
            System.out.println();
        }
    }   
}

