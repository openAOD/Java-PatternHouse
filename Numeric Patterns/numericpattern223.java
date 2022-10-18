
//pattern to be printed out
//5 * * * * *
//4 * * * *
//3 * * *
//2 * *
//1 *
//0

class numericpattern223 {
    public static void main(String[] args) {
        int n = 6;
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                if (col == 1){
                    System.out.print(n-row + " ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
