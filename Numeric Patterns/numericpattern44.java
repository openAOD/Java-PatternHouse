/**
 * pattern to be printed 
 * 
 *   1
 *   1 2
 *   2 3 4
 *   4 5 6 7
 *   7 8 9 10 11
 * numericpattern44
 * 
 */
class numericpattern44{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        int c=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
              System.out.print(c+"  ");
            c++;  
            }
            c-=1;
            System.out.println();
        }
    }  
}
