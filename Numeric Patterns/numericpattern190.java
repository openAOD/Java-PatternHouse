

//Pattern to be printed
//        1
//      * 1
//    3 * 1
//  * 3 * 1
//5 * 3 * 1

public class numericpattern190 {
    public static void main(String[] args) {
        int n= 5;
        for (int row = 1; row <= n; row++) {
            int col_count = 1;
            for (int spaces = n-row; spaces > 0 ; spaces--) {
                System.out.print("  ");
                col_count++;
            }
            for (int col = 1; col <= row; col++) {
                if ( (n-col_count+1) % 2 == 1){
                    System.out.print( n-col_count+1 +" ");
                }else{
                    System.out.print("* ");
                }
                col_count++;
            }
            System.out.println();
        }
    }
}
