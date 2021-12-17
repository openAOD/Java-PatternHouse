
//pattern to be printed
//    A
//   2 2
//  C C C
// 4 4 4 4
//E E E E E

public class numericpattern213 {
    public static void main(String[] args) {
        int n = 5;
        char value = 'A';
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n-row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row - 1; col++) {
                if (col%2==0){
                    System.out.print(" ");
                }else{
                    if (row % 2 == 0){
                        System.out.print(row);
                    }else{
                        System.out.print(value);
                    }
                }
            }
            value++;
            System.out.println();
        }
    }
}
