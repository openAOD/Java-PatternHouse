
//Pattern to be printed
//5 * 3 * 1
//  * 3 * 1
//    3 * 1
//      * 1
//        1

public class numericpattern194 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            int col_count = 1;
            for (int spaces = 1; spaces < row; spaces++) {
                System.out.print("  ");
                col_count++;
            }
            for (int col = 1; col <= n-row+1; col++) {
                if (col_count % 2 == 1){
                    System.out.print( (n-col_count+1) + " ");
                }else{
                    System.out.print("* ");
                }
                col_count++;
            }
            System.out.println();
        }
    }
}
