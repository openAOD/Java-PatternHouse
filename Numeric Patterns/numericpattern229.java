
//pattern to be printed
//5       1
//  4   2
//    3
//  4   2
//5       1

public class numericpattern229 {
    public static void main(String[] args) {
        int n= 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == row || n-col+1 == row){
                    System.out.print( n-col+1 + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}