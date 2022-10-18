
// pattern to be printed
// 5 5 5 5 5
//   D D D D
//     3 3 3
//       B B
//         1

class numericpattern211 {
    public static void main(String[] args) {
        int n = 5;
        char value = (char) (64+n);
        for (int row = 1; row <= n ; row++) {
            for (int spaces = 1; spaces <= row-1; spaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n-row+1; col++) {
                if (row % 2 == 1){
                    System.out.print( n-row+1 + " ");
                }else{
                    System.out.print(value + " ");
                }
            }
            value--;
            System.out.println();
        }
    }
}