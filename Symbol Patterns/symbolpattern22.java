/**
 * pattern to be printed 
 * 
 * E E E E E 
 * D D D D *
 * C C C * *
 * B B * * *
 * A * * * *
 * 
 * symbolpattern22
 */
class symbolpattern22 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern22(rows);
    }
    private static void symbolPattern22(int n) {
        int  alphabet = 64;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <=n-i; j++) {
                System.out.print((char)(alphabet+n-i+1)+" ");
            }
        
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }

    }

}
