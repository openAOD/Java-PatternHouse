/**
 * pattern to be printed 
 * 
 *    17 18 19 20
 *    14 15 16
 *    12 13 
 *    11
 * numericpattern63
 * 
 */
public class numericpattern63{
    public static void main(String[] args) {
        int rows = 4;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            if(i==n||i==1)System.out.print(2*(n+i)+j+1+"  ");
            else System.out.print(2*(n+i)+j+"  ");
            }
            System.out.println();
        }
    }   
}

