/**
 * pattern to be printed 
 * 
      E D C B A
      * D C B A
      * * C B A
      * * * B A
      * * * * A     

 * 
 * symbolpattern27
 */
class symbolpattern27 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern27(rows);
    }
    
    private static void symbolPattern27(int n) {
        int  alphabet = 64;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print("* ");
            }
        
            for (int j = 0; j <=n-i; j++) {
                System.out.print((char)(alphabet+n-i-j+1)+" ");
                
            }
            System.out.println();
        }

    }


}

