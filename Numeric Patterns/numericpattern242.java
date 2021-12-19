
//pattern to be printed
//1
//1 2
//1   3
//1     4
//1 2 3 4 5

public class numericpattern242 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (row==n){
                    System.out.print(col + " ");
                }else if(col == 1 || col == row){
                    System.out.print(col + " ");
                }else{
                    System.out.print( "  ");
                }
            }
            System.out.println();
        }
    }
}
