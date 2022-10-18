
/**
 * pattern to be printed 
 * 
 *   1
 *   1 2
 *   3 5 8
 *   13 21 35 55
 *   89 144 233 477 610
 * numericpattern47
 * 
 */
class numericpattern47{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
    int c=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
              System.out.print(fib(c)+"  "); 
              c++;
            }
            System.out.println();
        }
    } 
    private static int fib(int n) {
        if (n <= 1)
        return n;
     return fib(n-1) + fib(n-2);    
    } 
}

