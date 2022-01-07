import java.util.Scanner;
public class AlphabeticPattern172
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int width = 2*height-1;
        
        for(int i = 0; i < height; i++) {
            
            for(int j = 1; j <= width+1; j++) {
            
                if((i == 0 || i == (height-1)) && (j == 0 || j == (width-2))) {
                    System.out.print(" ");
                }
                else if(j == 1) {
                    System.out.print("G ");
                }
                else if(i == 0 && j <= height) {
                    System.out.print("G ");
                }
                else if(i == height/2 && j < height && j>=height/2+1) {
                    System.out.print("G ");
                }
                else if(i >= height/2 && j == height) {
                    System.out.print("G ");
                }
                else if(i == height-1 && j <= height) {
                    System.out.print("G ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// G G G G G
// G
// G   G G G
// G       G
// G G G G G



