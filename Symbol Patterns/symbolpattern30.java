/**
 * pattern to be printed 
 * 
      * A * B *
      C * D * E
      * F * G *
      H * I * J
      * K * L *    

 * 
 * symbolpattern30
 */
public class symbolpattern30 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern30(rows);
    }
    
    private static void symbolPattern30(int n) {
        int c=1,count=1,alphabet =64;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                if (count%2!=0) {
                    System.out.print("* ");
                } else {
                    System.out.print((char)(alphabet+c)+" ");
                    c++;    
                }
                count++;
            }
            System.out.println();
            }
        }

    }







