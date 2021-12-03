
import java.util.Scanner;

public class numericpattern35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();                          // Taking input
        int i = 1;
        for (int row = 1; row <= n; row++) {              // Iterating through rows
            for (int col = 1; col <= row; col++) {        // Iterating through columns
                System.out.print( i + " " );
                i += 2;                                   // for each number of every column and first number of each row
            }
            System.out.println();                         // for breaking each line
        }
    }
}
