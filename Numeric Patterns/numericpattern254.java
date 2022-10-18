
//pattern to be printed
//1 2 3 4 5
//  2     5
//    3   5
//      4 5
//        5

class numericpattern254{
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            int value = 1;
            for (int spaces = 1; spaces < row; spaces++) {
                System.out.print("  ");
                value++;
            }
            for (int col = 1; col <= n-row+1; col++) {
                if (col == 1 || col==n-row+1 || row == 1){
                    System.out.print( value + " ");
                }else{
                    System.out.print("  ");
                }
                value++;
            }
            System.out.println();
        }
    }
}

