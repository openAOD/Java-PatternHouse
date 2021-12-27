
//pattern to be printed out
//0
//* 1
//* * 2
//* * * 3
//* * * * 4
//* * * * * 5

public class numericpattern224 {
    public static void main(String[] args) {
        int n = 6;
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row; col++) {
                if (col == row){
                    System.out.print(row-1 + " ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
