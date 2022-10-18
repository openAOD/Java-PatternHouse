
//Pattern to be printed
//        1
//      * 2
//    3 * 3
//  * 4 * 4
//5 * 5 * 5

class numericpattern191 {
    public static void main(String[] args) {
        int n= 5;

        for (int row = 1; row <= n; row++) {
            int col_count = 1;
            for (int spaces = n-row; spaces > 0 ; spaces--) {
                System.out.print("  ");
                col_count++;
            }
            for (int col = 1; col <= row; col++) {
                if ( (col_count) % 2 == 1){
                    System.out.print( row +" ");
                }else{
                    System.out.print("* ");
                }
                col_count++;
            }
            System.out.println();
        }
    }
}
