
//pattern to be printed
//1 12 11 10 9
//2       8
//3    7
//4 6
//5

class numericpattern249{
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                if ( col!= 1 && row == 1 && col != n-row+1){
                    System.out.print( 3*n-col-1 + " ");
                }else if(col == 1 ){
                    System.out.print(row + " ");
                }else if(col == n-row+1){
                    System.out.print( n + col -1+ " ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
