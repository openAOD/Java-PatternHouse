/**
 * pattern to be printed 
 * 
      1# 
      2# 3#
      4# 5# 6# 
      7# 8# 9# 10#

 * symbolpattern34
 */
class symbolpattern34 {
    public static void main(String[] args) {
        int rows = 4;
        symbolPattern(rows);
    }
    
    private static void symbolPattern(int n) {
        int c=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
            System.out.print(c+"# ");
            c++;
            }
            System.out.println();
            }
        }

    }





