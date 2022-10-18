
//Pattern to be printed
//5 4 3 2 1
//  * * * *
//    3 2 1
//      * *
//        1

class numericpattern193 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
        int col_count = 1;
            for (int spaces = 1; spaces < row; spaces++) {
                System.out.print("  ");
                col_count++;
            }
            for (int col = 1; col <= n-row+1; col++) {
                if (row%2==1){
                    System.out.print( (n-col_count+1) + " ");
                    col_count++;
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
