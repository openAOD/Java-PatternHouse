
//pattern to be printed
//    2
//    1
//2 1 0 1 2
//    1
//    2

class numericpattern233 {
    public static void main(String[] args) {
        int n= 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                int value = col == n/2+1 ? n/2-row+1 : n/2+1-col;
                if (col == n/2+1 || row == n/2+1){
                    System.out.print( Math.abs(value) + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
