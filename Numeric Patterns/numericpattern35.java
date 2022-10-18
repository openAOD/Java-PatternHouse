/**
 * pattern to be printed 
 * 
 *   1
 *   3 5
 *   7 9 11
 *   13 15 17 19
 *   21 23 25 27 29
 * numericpattern35
 * 
 */
class numericpattern35{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        int c=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
              System.out.print(2*c-1+" ");
              c++;
            }
            System.out.println();
        }
    }   
}
