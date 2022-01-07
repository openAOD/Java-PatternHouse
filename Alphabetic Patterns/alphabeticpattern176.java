import java.util.Scanner;
import java.lang.*;
public class AlphabeticPattern176
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern 
        
        int half = height/2;
        int dummy = half;
        
        for(int i = 0; i < height; i++) {
            System.out.print("K ");
            
            for(int j = 0; j <= half; j++) {
            
                if(j == Math.abs(dummy)) {
                    System.out.print("K ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            dummy--;
        }
    }
}

// Sample Input :- 5
// Output :-
// K   K
// K  K
// K K
// K  K
// K   K



