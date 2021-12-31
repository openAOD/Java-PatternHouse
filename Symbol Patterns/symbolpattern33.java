/**
 * pattern to be printed 
 * 
      1 
      1 * 2
      1 * 2 * 3
      1 * 2 * 3 * 4

 * symbolpattern33
 */
public class symbolpattern33 {
    public static void main(String[] args) {
        int rows = 4;
        symbolPattern(rows);
    }
    
    private static void symbolPattern(int n) {
        
        for (int i = 1; i <= n; i++) {
            int c=1;
            for (int j = 1; j <=i*2-1; j++) {
                if (j%2!=0) {
                    System.out.print(c+" ");
                    c++;
                } else {
                    System.out.print("* ");   
                }
            }
            System.out.println();
            }
        }

    }




