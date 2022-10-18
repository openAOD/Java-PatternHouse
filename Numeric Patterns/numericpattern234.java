//pattern to be printed out
// 1 0 0 0 0
// 0 1 0 0 0
// 0 0 1 0 0
// 0 0 0 1 0
// 0 0 0 0 1

class numericpattern234 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == row){
                    System.out.print(1 +" ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
