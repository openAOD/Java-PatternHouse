/**
 * pattern to be printed 
 * 
      * * * * A
      * * * B B
      * * C C C
      * D D D D
      E E E E E     

 * 
 * symbolpattern24
 */
class symbolpattern24 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern24(rows);
    }
    
    private static void symbolPattern24(int n) {
        int  alphabet = 64;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print("* ");
            }
        
            for (int j = 1; j <=i; j++) {
                System.out.print((char)(alphabet+i)+" ");
                
            }
            System.out.println();
        }

    }

}

