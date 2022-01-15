import java.util.Scanner;
import java.lang.*;

public class AlphabeticPattern182 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int i, j, space = (height / 3);
        int width = height / 2 + height / 5 + space + space;
        
        for (i = 0; i < height; i++) {
        
            for (j = 0; j < width; j++) {
            
                if( i == 0 || i == height-1 || j == 0 || j == height-1) {
                    System.out.print("Q ");
                }
                else {
                    System.out.print("  ");
                }
             }
          
             if (space != 0 && i < height / 2) {
                 space--;
             }
             else if (i >= (height / 2 + height / 5)) {
                 space--;
             }
             System.out.println();
        }
      
        int d = height;
        for (i = 0; i < height / 2; i++) {
          
            for (j = 0; j <= d; j++) {
            
                if (j == d)
                    System.out.print("Q ");
                else
                    System.out.print("  ");
            }
            System.out.println();
            d++;
        }
    }
}

// Sample Input :- 5
// Output :-
// Q Q Q Q Q
// Q       Q
// Q       Q
// Q       Q
// Q Q Q Q Q 
//           Q
//             Q
