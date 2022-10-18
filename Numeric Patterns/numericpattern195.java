
//Pattern to be printed
//         1
//        * *
//       3 3 3
//      * * * *
//     5 5 5 5 5

class numericpattern195 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n-row ; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row - 1; col++) {
                if (col % 2 == 1){
                    if (row % 2 == 1){
                        System.out.print(row );
                    }else{
                        System.out.print("*");
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
