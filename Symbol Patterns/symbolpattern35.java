/**
 * pattern to be printed 
 * 
      1
      3 * 2
      4 * 5 * 6
      10 * 9 * 8 * 7


 * symbolpattern35
 */
public class symbolpattern35 {
    public static void main(String[] args) {
        int rows = 4;
        symbolPattern(rows);
    }
    
    private static void symbolPattern(int n) {
        int c=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i*2-1; j++) {
                if ( i%2!=0  && j%2!=0) {
                    System.out.print(c+" ");
                    c++;
                }
                else if ( i%2==0  && j%2!=0) {
                    int r=c;
                System.out.print(i+r-j+" ");
                c++;
                } else {
                    System.out.print("* ");   
                }
            }
            System.out.println();
            }
        }
    }
        
