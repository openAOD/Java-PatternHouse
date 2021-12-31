/**
 * 
 * pattern to be printed 
 * 
 *          1
 *        2 2
 *      3 3 3
 *    4 4 4 4
 *      5 5 5
 *        6 6
 *          7
 * numericpattern123
 */
public class numericpattern123 {

 
    public static void main(String[] args) {
        int rows = 7;
        numericPattern123(rows);
    }
    private static void numericPattern123(int n) {
    int c=1;
        n/=2;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <=  i; j++) {
                System.out.print((c)+" ");
            }
            c++;
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            for (int j = -1; j <i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print((c)+" ");
            }
            c++;
            System.out.println();
        }

    }

}    

   
