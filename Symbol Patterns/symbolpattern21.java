/** pattern to be printed 
 * 
 * A * * * *
 * A B * * *
 * A B C * *
 * A B C D *
 * A B C D E
 * 
 * symbolpattern21
 */
class symbolpattern21 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern21(rows);
    }
    private static void symbolPattern21(int n) {
        int  alphabet = 64;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print((char)(alphabet+j+1)+" ");
            }
        
            for (int j = i; j < n; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }

    }

}
