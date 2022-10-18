/**
 * 
 * pattern to be printed 
 * 
 *       1
 *     4 9 16 
 * 25 36 49 64 81
 * numericpattern112
 */
class numericpattern112 {

    public static void main(String[] args) {
        int rows = 3;
        numericPattern112(rows);
    }
    private static void numericPattern112(int n) {
        int c=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }
        
            for (int j = 1; j <= 2* i -1; j++) {
                System.out.print((int)(Math.pow(c, 2)) + " ");
                c+=1;
            }
            System.out.println();
        }

    }

}
