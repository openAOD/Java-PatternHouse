
//pattern to be printed
//5
//5 4
//5   3
//5     2
//5 4 3 2 1

public class numericpattern245 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (row==n){
                    System.out.print(n-col+1 + " ");
                }else if(col == 1 || col == row){
                    System.out.print(n-col+1 + " ");
                }else{
                    System.out.print( "  ");
                }
            }
            System.out.println();
        }
    }
}
