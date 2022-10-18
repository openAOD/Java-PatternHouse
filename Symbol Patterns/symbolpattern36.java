/**
 * pattern to be printed 
 * 
      1#
      3# 2#
      4# 5# 6#
      10# 9# 8# 7#
 * symbolpattern36
 */
class symbolpattern36 {
    public static void main(String[] args) {
        int rows = 4;
        symbolPattern(rows);
    }
    
    private static void symbolPattern(int n) {
        int c=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if ( i%2!=0 ) {
                System.out.print(c+"# ");
                }
                else  {
                System.out.print((c+i-2*j+1)+"# ");
                } 
                c++;
            }
            System.out.println();
            }
        }
    }
        

