
//pattern to be printed
//1       5
//  2   4
//    3
//  2   4
//1       5

class numericpattern228 {
    public static void main(String[] args) {
        int n= 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == row || n-col+1 == row){
                    System.out.print( col + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
