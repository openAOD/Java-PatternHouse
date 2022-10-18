// pattern to be printed
//    1
//   2 2
//  3   3
// 4     4
//5       5

class numericpattern256 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n-row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                if (col == 1 || col == 2*row-1){
                    System.out.print(row);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
