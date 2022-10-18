

class numericpattern179 {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <= n; row++) {
            if (row%2 == 0){
                for (int col = 1; col <= row ; col++) {
                    System.out.print("* ");
                }
            }else{
                for (int col = 1; col <= row ; col++) {
                    System.out.print(row + " ");
                }
            }
            System.out.println();
        }
    }
}
