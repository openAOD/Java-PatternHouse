/**
 * 
 * pttern to be printed 
 * 
 * 
 *  9 9 9 9 9 9 9 9 9
 *    7 7 7 7 7 7 7
 *      5 5 5 5 5
 *        3 3 3
 *          1
 * 
 * numericpattern114
 */
public class numericpattern114 {

    public static void main(String[] args) {
        int rows = 5;
        numericPattern114(rows);
    }
    private static void numericPattern114(int n) {
        n+=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <=  i; j++) {
                System.out.print("  ");
            }
        
            for (int j = 1; j <= 2* (n-i) -1; j++) {
                System.out.print(2*(n-i)-1 + " ");
                
            }
            System.out.println();
        }

    }

}
    

