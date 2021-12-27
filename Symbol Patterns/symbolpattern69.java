/**
 * pattern to be printed 
 * 
     0
     * 1
     * * 2
     * * * 3
     * * * * 4
     * * * * * 5
    

 * symbolpattern69
 */
public class symbolpattern69 {
    public static void main(String[] args) {
        int rows = 6;
        symbolPattern(rows);
    }
    private static void symbolPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <i; j++) {
                if (i-j==1)  System.out.print(i-1+"  ");
                else  System.out.print("*  ");
            }
            
            System.out.println();
            }
        }
    }
        

