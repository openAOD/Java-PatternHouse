/**
 * pattern to be printed 
 * 
 *   1
 *   1 1
 *   1 2 1
 *   1 3 3 1
 *   1 4 6 4 1
 * numericpattern43
 * 
 */
public class numericpattern43{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        --n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
              System.out.print(facto(i)/(facto(j)*facto(i-j))+"  ");
            }
            System.out.println();
        }
    } 
    private static int facto(int num) {
    int sum =1;
    for (int index = 2; index <= num; index++) sum*=index;  
    return sum; 
    }  
}
