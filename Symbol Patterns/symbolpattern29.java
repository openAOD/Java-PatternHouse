/**
 * pattern to be printed 
 * 
      * 1 * 2 *
      3 * 4 * 5
      * 6 * 7 *
      8 * 9 * 10
      * 11 * 12 *    

 * 
 * symbolpattern29
 */
class symbolpattern29 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern29(rows);
    }
    
    private static void symbolPattern29(int n) {
        int c=1,count=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                if (count%2!=0) {
                    System.out.print("* ");
                } else {
                    System.out.print(c+" ");
                    c++;    
                }
                count++;
            }
            System.out.println();
            }
        }

    }






