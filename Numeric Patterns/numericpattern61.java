/**
 * pattern to be printed 
 * 
 *    1  2  3  4  5
 *    6  7  8  9 
 *   10 11 12
 *   13 14
 *   15
 * 
 * numericpattern61
 * 
 */
class numericpattern61{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        int c=1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
              System.out.print(c+"  ");
              c++;
            }
            System.out.println();
        }
    }   
}
