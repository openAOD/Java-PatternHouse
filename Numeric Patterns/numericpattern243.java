
//pattern to be printed
//1
//2 3
//4    5
//6       7
//8 9 10 11 12

class numericpattern243 {
    public static void main(String[] args) {
        int n = 5;
        int value = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (row==n){
                    System.out.print(value + " ");
                    value++;
                }else if(col == 1 || col == row){
                    System.out.print(value + " ");
                    value++;
                }else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}