
//  pattern to be printed
//  1 2 3 4 5
//    A B C D
//      1 2 3
//        A B
//          1

class numericpattern212 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n ; row++) {
            for (int spaces = 1; spaces <= row-1; spaces++) {
                System.out.print("  ");
            }
            char value = row % 2 == 1 ? '1' : 'A';
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }
}