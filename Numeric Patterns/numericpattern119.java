/**
 * 
 * pattern to be printed 
 * 
 *  1
 *  2 3
 *  4 5 6
 *  7 8 9 10
 * 11 12 13
 * 14 15
 * 16
 * 
 * numericpattern119
 */
class numericpattern119 {
    public static void main(String[] args) {
        int rows = 6;
        numericPattern119(rows);
    }
    private static void numericPattern119(int n) {
        int c=1;
        n/=2;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=  i; j++) {
                System.out.print((c)+"  ");
                c++;
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print((c)+"  ");
                c++;
            }
            System.out.println();
        }

    }

}


