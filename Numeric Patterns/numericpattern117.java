/**
 * 
 * pattern to be printed 
 * 
 * 3
 * 2 3
 * 1 2 3
 * 0 1 2 3
 * 1 2 3
 * 2 3
 * 3
 * 
 * numericpattern117
 */
class numericpattern117 {
    public static void main(String[] args) {
        int rows = 6;
        numericPattern116(rows);
    }
    private static void numericPattern116(int n) {
        n/=2;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=  i; j++) {
                System.out.print(((n-i)+j)+"  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print((i+j+1)+"  ");
            }
            System.out.println();
        }

    }

}
    
