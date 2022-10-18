
//pattern to be printed
//    1
//   A B
//  1 2 3
// A B C D
//1 2 3 4 5

class numericpattern216 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n-row; spaces++) {
                System.out.print(" ");
            }
            char value = row % 2 == 1?'1':'A';
            for (int col = 1; col <= 2*row - 1; col++) {
                if (col%2==0){
                    System.out.print(" ");
                }else{
                    System.out.print(value);
                    value++;
                }
            }
            System.out.println();
        }
    }
}
