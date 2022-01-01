
//pattern to be printed
//        5
//      4 5
//    3   5
//  2     5
//1 2 3 4 5

public class numericpattern251 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            int value = 1;
            for (int spaces = 1; spaces <= n-row; spaces++) {
                System.out.print("  ");
                value++;
            }
            for (int col = 1; col <= row; col++) {
                if (col == row || col == 1 || row == n){
                    System.out.print(value + " ");
                }else{
                    System.out.print("  ");
                }
                value++;
            }

            System.out.println();
        }
    }
}
