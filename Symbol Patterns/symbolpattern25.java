/**
 * pattern to be printed 
 * 
      * * * * A
      * * * B A
      * * C B A
      * D C B A
      E D C B A     

 * 
 * symbolpattern25
 */
class symbolpattern25 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern25(rows);
    }
    
    private static void symbolPattern25(int n) {
        int  alphabet = 64;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print("* ");
            }
        
            for (int j = 1; j <=i; j++) {
                System.out.print((char)(alphabet+i-j+1)+" ");
                
            }
            System.out.println();
        }

    }

}

