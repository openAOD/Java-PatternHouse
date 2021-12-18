
//pattern to be printed
//5       5
//  4   4
//    3
//  2   2
//1       1

public class numericpattern227 {
    public static void main(String[] args) {
        int n= 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == row || n-col+1 == row){
                    System.out.print( n-row+1 + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
