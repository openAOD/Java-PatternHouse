/**
 * pattern to be printed 
 * 
 *   0
 *   0 1
 *   0 1 1
 *   0 1 1 2
 *   0 1 1 2 3
 * numericpattern48
 * 
 */
class numericpattern48{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
              System.out.print(fib(j-1)+"  ");
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
