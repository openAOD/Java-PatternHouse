
//pattern to be printed
//E E E E E
//4 4 4 4
//C C C
//2 2
//A

public class numericpattern201 {
    public static void main(String[] args) {
        int n = 5;
        char value = (char) ('A' + (n-1));
        for (int row = 1; row <= n; row++) {
            for (int col = n-row+1; col > 0 ; col--) {
                if (row % 2 == 0){
                    System.out.print(n-row+1 + " ");
                }else{
                    System.out.print(value + " ");
                }
            }
            value--;
            System.out.println();
        }
    }
}
