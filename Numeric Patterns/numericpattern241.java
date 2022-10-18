
//pattern to be printed
//1
//2 2
//3   3
//4     4
//5 5 5 5 5

class numericpattern241 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (row==n){
                    System.out.print(n + " ");
                }else if(col == 1 || col == row){
                    System.out.print(row + " ");
                }else{
                    System.out.print( "  ");
                }
            }
            System.out.println();
        }
    }
}
