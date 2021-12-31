/**
 * pattern to be printed 
 * 
     5 * * * * *
     4 * * * *
     3 * * *
     2 * *
     1 *
     0

 * symbolpattern68
 */
public class symbolpattern68 {
    public static void main(String[] args) {
        int rows = 6;
        symbolPattern(rows);
    }
    private static void symbolPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <=n-i; j++) {
                if (j==0)  System.out.print(n-i+"  ");
                else  System.out.print("*  ");
            }
            
            System.out.println();
            }
        }
    }
        

