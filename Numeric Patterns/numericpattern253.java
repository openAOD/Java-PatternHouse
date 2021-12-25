
//pattern to be printed
//5 5 5 5 5
//  4     4
//    3   3
//      2 2
//        1

public class numericpattern253{
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces < row; spaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n-row+1; col++) {
                if (col == 1 || col==n-row+1 || row == 1){
                    System.out.print( n-row+1 + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
