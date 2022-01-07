import java.util.Scanner;
public class AlphabeticPattern169
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 0; i < height; i++) {
            System.out.print("D ");
            
            for(int j = 1; j < height; j++) {
            
                if((i == 0 || i == (height-1)) && j < (height-1)) {
                    System.out.print("D ");
                }
                else if(j == (height-1) && i != 0 && i != (height-1)) {
                    System.out.print("D ");
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
// D D D D
// D       D
// D       D
// D       D
// D D D D
