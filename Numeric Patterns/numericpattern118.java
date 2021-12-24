/**
 * 
 * pattern to be printed 
 * 
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 * numericpattern118
 */
public class numericpattern118 {
    public static void main(String[] args) {
        int rows = 6;
        numericPattern118(rows);
    }
    private static void numericPattern118(int n) {
        n/=2;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=  i; j++) {
                System.out.print((j+1)+"  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print((j+1)+"  ");
            }
            System.out.println();
        }

    }

}

