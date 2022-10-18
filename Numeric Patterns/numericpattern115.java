/**
 * 
 * pattern to be printed 
 * 
 *  1 2 3 4 5 6 7 8 9
 *    1 2 3 4 5 6 7
 *      1 2 3 4 5
 *        1 2 3
 *          1
 * numericpattern115
 */
class numericpattern115 {
    public static void main(String[] args) {
        int rows = 5;
        numericPattern115(rows);
    }
    private static void numericPattern115(int n) {
        n+=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <=  i; j++) {
                System.out.print("  ");
            }
        
            for (int j = 1; j <= 2* (n-i) -1; j++) {
                System.out.print(j + " ");
                
            }
            System.out.println();
        }

    }

}
    
