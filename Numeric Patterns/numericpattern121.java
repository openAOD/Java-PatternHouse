/**
 * 
 * pattern to be printed 
 * 
 *          3
 *        3 2
 *      3 2 1
 *    3 2 1 0
 *      3 2 1
 *        3 2
 *          3
 * 
 * 
 * numericpattern121
 */
class numericpattern121 {


    public static void main(String[] args) {
        int rows = 7;
        numericPattern121(rows);
    }
    private static void numericPattern121(int n) {
    
        n/=2;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <=  i; j++) {
                System.out.print((n-j)+" ");
            }
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            for (int j = -1; j <i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print((n-j)+" ");
            }
            System.out.println();
        }

    }

}    

