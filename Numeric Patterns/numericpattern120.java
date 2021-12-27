/**
 * 
 * pattern to be printed 
 * 
 * 1
 * 3 3 3
 * 5 5 5 5
 * 3 3 3
 * 1
 * 
 * numericpattern120
 */
public class numericpattern120 {

    public static void main(String[] args) {
        int rows = 5;
        numericPattern120(rows);
    }
    private static void numericPattern120(int n) {
    
        n/=2;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=  i; j++) {
                System.out.print((2*(i+1)-1)+"  ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print((2*(n-i)-1)+"  ");
            }
            System.out.println();
        }

    }

}

    

