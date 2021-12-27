
//pattern to be printed
//1
//2 12
//3   11
//4     10
//5 6 7 8 9

public class numericpattern244 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            int value = 3*n-row-1;
            for (int col = 1; col <= row; col++) {
                if (row==n){
                    System.out.print(n+col-1 + " ");
                }else if(col == 1){
                    System.out.print(row + " ");
                }else if (col == row){
                    System.out.print(value );
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}