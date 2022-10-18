
//pattern to be printed
//5 5 5 5 5
// D D D D
//  3 3 3
//   B B
//    1

class numericpattern219 {
    public static void main(String[] args) {
        int n =5;
        char value = (char) (65 + (n-1));
        for (int row = 1; row <=5 ; row++) {
            for (int spaces = 1; spaces < row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*(n-row)+1; col++) {
                if (col % 2 == 0){
                    System.out.print(" ");
                }else{
                    if (row % 2 == 1){
                        System.out.print( n-row+1);
                    }else{
                        System.out.print(value);
                    }
                }
            }
            value--;
            System.out.println();
        }
    }
}
