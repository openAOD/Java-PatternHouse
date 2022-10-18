
//pattern to be printed
//1
//B B
//3 3 3
//D D D D
//5 5 5 5 5

class numericpattern199 {
    public static void main(String[] args) {
        int n = 5;
        char value = 'A';
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if (row % 2 == 1){
                    System.out.print(row + " ");
                }else{
                    System.out.print(value + " ");
                }
            }
            value++;
            System.out.println();
        }
    }
}
