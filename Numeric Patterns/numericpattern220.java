
//pattern to be printed
// 1 2 3 4 5
//  A B C D
//   1 2 3
//    A B
//     1

public class numericpattern220 {
    public static void main(String[] args) {
        int n =5;
        for (int row = 1; row <=5 ; row++) {
            for (int spaces = 1; spaces < row; spaces++) {
                System.out.print(" ");
            }
            char value = row % 2 == 1?'1':'A';
            for (int col = 1; col <= 2*(n-row)+1; col++) {
                if (col % 2 == 0){
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

