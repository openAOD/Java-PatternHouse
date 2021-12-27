/**
 * pattern to be printed 
 * 
      1 2 3 4 *
      1 2 3 * 5
      1 2 * 4 5
      1 * 3 4 5
      * 2 3 4 5     

 * 
 * symbolpattern28
 */
public class symbolpattern28 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern28(rows);
    }
    
    private static void symbolPattern28(int n) {
        for (int i = 1; i <= n; i++) {
            int c=1;
            for (int j = 1; j <=n; j++) {
                if (n-i+1==j) System.out.print("* ");
                else System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }

    }


}


