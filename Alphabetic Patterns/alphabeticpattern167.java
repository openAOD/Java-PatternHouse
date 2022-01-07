import java.util.Scanner;
public class AlphabeticPattern167
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int width = height;
     
        int half = height/2;
        
        for(int i = 0; i < height; i++) {
            System.out.print("B ");
            
            for(int j = 0; j < width; j++) {
            
                if((i == 0 || i == (height-1) || i == half) && j < (width-2)) {
                    System.out.print("B ");
                }
                else if(j == (width - 2) && !(i == 0 || i == (height - 1) || i == half)) {
                    System.out.print("B ");
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
// B B B B
// B       B
// B B B B 
// B       B
// B B B B


