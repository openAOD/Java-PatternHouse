/**
 * pattern to be printed 
 * 
 *  1 1 1 1 1
 *  0 0 0 0 0
 *  1 1 1 1 1
 *  0 0 0 0 0
 *  1 1 1 1 1
 * numericpattern22
 * 
 */
class numericpattern22 {
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
            if(i%2!=0) System.out.print(1+" ");
            else  System.out.print(0+" ");
            }
            System.out.println();
        }
    }   
}

