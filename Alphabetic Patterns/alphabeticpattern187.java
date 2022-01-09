import java.util.Scanner;
import java.lang.*;
public class AlphabeticPattern187 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int width = 2*height-1;
        int i, j, counter = 0;
    
        for (i = 0; i < height; i++) {
            for (j = 0; j <= width; j++) {
                if (j == counter || j == width-counter-1)
                    System.out.print("V");
                
                else
                    System.out.print(" ");
            }
            counter++;
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// V       V
//  V     V
//   V   V
//    V V
//     V
