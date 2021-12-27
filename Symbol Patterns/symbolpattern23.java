/**
 * pattern to be printed 
 * 
 * A B C D E 
 * A B C D *
 * A B C * *
 * A B * * *
 * A * * * *
 * 
 * symbolpattern23
 */
public class symbolpattern23 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern23(rows);
    }
    
    private static void symbolPattern23(int n) {
        int  alphabet = 64;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <=n-i; j++) {
                System.out.print((char)(alphabet+j+1)+" ");
            }
        
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }

    }

}
