/**
 * pattern to be printed 
 * 
 *   1
 *   3 2
 *   6 5 4
 *   10 9 8 7
 * numericpattern34
 * 
 */
class numericpattern34{
    public static void main(String[] args) {
        int rows = 4;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        int c=1;
        for (int i = 1; i <= n; i++) {
            int count =c;
            for (int j = 1; j <= i; j++) {
              System.out.print(count+" ");
              count--;
            }
            c+=i+1;
            System.out.println();
        }
    }   
}
