
//pattern to be printed
//1
//A B
//1 2 3
//A B C D
//1 2 3 4 5

class numericpattern200 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            char value = 'A';
            for (int col = 1; col <= row; col++) {
                if (row % 2 == 1){
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
