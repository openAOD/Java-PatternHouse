
//pattern to be printed
//           1
//        2  3
//     4     5
//  6        7
//8 9 10 11 12

public class numericpattern252 {
    public static void main(String[] args) {
        int n = 5;
        int value = 1;
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n-row; spaces++) {
                if ((2*n-3) < 9 && spaces == 1){
                    System.out.print("  ");
                }else{
                    System.out.print("   ");
                }
            }
            for (int col = 1; col <= row; col++) {
                if (col == row || row == n){
                    System.out.print(value + " ");
                    value++;
                }else if (col==1){
                    System.out.print(value + "  ");
                    value++;
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
