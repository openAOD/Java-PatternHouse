
// pattern to be printed
//        A
//      1 2
//    A B C
//  1 2 3 4
//A B C D E

class numericpattern206 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n ; row++) {
            for (int spaces = 1; spaces <= n-row; spaces++) {
                System.out.print("  ");
            }
            char value = row % 2 == 0 ? '1' : 'A';
            for (int col = 1; col <= row; col++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }
}
