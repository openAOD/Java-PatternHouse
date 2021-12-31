/**
 * pattern to be printed 
 * 
      E E E E E
      * D D D D
      * * C C C
      * * * B B
      * * * * A     

 * 
 * symbolpattern26
 */
public class symbolpattern26 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern26(rows);
    }
    
    private static void symbolPattern26(int n) {
        int  alphabet = 64;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print("* ");
            }
        
            for (int j = 0; j <=n-i; j++) {
                System.out.print((char)(alphabet+n-i+1)+" ");
                
            }
            System.out.println();
        }

    }


}

