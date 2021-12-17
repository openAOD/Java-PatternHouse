
//pattern to be printed
//5 5 5 5 5
//D D D D
//3 3 3
//B B
//1

public class numericpattern203 {
    public static void main(String[] args) {
        int n = 5;
        char value = (char) ('A' + (n-1));
        for (int row = 1; row <= n; row++) {
            for (int col = n-row+1; col > 0 ; col--) {
                if (row % 2 == 1){
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