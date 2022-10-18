
//pattern to be printed
//    1
//   ABC
//  23456
// DEFGHIJ
//789123456

class numericpattern221 {
    public static void main(String[] args) {
        int n = 5;
        int int_value = 1;
        char char_value = 'A';
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n-row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row - 1; col++) {
                if (row % 2 == 1){
                    System.out.print(int_value);
                    if (int_value == 9){
                        int_value = 0;
                    }
                    int_value++;
                }else{
                    System.out.print(char_value);
                    char_value++;
                }
            }
            System.out.println();
        }
    }
}
