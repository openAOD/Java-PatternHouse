
//pattern to be printed
//        1
//      2 2
//    3   3
//  4     4
//5 5 5 5 5

class numericpattern250 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n-row; spaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                if (col == row || col == 1 || row == n){
                    System.out.print(row + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
