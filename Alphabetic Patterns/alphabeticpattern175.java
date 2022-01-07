import java.util.Scanner;
public class AlphabeticPattern175
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 0; i < height; i++) {
            
            for(int j = 1; j <= height; j++) {
            
                if(i == 0) {
                    System.out.print("J ");
                }
                else if(i == (height-1) && (j>0 && j<height-1)) {
                    System.out.print("J ");
                }
                else if((j == height-1 && i != height-1) || (i > height/2-1 && j == 0 && i != height-1)) {
                    System.out.print(" J ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :-
// Output :-
// J J J J J
//     J
//     J
//     J
// J J J



