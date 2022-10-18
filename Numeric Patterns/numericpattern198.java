
//pattern to be printed
//A
//1 2
//A B C
//1 2 3 4
//A B C D E

class numericpattern198 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            char value = 'A';
            for (int col = 1; col <= row; col++) {
                if (row % 2 == 0){
                    System.out.print(col + " ");
                }else{
                    System.out.print(value + " ");
                    value++;
                }
            }
            System.out.println();
        }
    }
}
