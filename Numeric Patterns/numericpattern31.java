/**
 * pattern to be printed 
 * 
 *   1
 *   2 3
 *   4 5 6
 *   7 8 9 10
 * numericpattern31
 * 
 */
class numericpattern31{
    public static void main(String[] args) {
        int rows = 4;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        int c=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
              System.out.print(c+" ");
              c++;
            }
            System.out.println();
        }
    }   
}
