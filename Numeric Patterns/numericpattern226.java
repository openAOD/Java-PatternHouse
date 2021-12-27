
//pattern to be printed
//1      1
//  2   2
//    3
//  4   4
//5       5

public class numericpattern226 {
    public static void main(String[] args) {
        int n= 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == row || n-col+1 == row){
                    System.out.print(row + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
