
import java.util.Scanner;

public class numericpattern34 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // Taking input
            int n = input.nextInt();
            int i = 1;
            // i keeps track of number starting in each row
            for (int row = 1; row <= n; row++) {                   // for iterating through rows
                int k = i;                                         // k  keeps track of numbers of each column
                for (int col = 1; col <= row; col++) {             // for iterating through columns
                    System.out.print(k + " ");
                    k--;
                }
                i = i+ row + 1;
                System.out.println();                             // for breaking each line
            }
        }
}
