
//Pattern to be printed
// 5 5 5 5 5
//  * * * *
//   3 3 3
//    * *
//     1

public class numericpattern196 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces < row ; spaces++) {
                System.out.print(" ");
            }
            for (int col = 2*(n - row) + 1; col > 0 ; col--) {
                if (col % 2 == 1){
                    if (row % 2 == 1){
                        System.out.print(n-row+1 );
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
