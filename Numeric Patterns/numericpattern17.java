/**
 * pattern to be printed 
 * 
 *  0 1 0 1 0
 *  1 0 1 0 1
 *  0 1 0 1 0
 *  1 0 1 0 1
 *  0 1 0 1 0
 * numericpattern17
 * 
 */
class numericpattern17 {
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
            if((j+i)%2==0) System.out.print(1+" ");
            else  System.out.print(0+" ");
            }
            System.out.println();
        }
    }   
}
