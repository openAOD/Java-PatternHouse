import java.util.Scanner;
public class AlphabeticPattern168
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 0; i < height; i++) {
            System.out.print("C ");
            
            for(int j = 0; j < height-1; j++) {
            
                if(i == 0 || i == (height-1)) {
                    System.out.print("C ");
                }
                
                else {
                    continue;
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// C C C C C
// C
// C
// C
// C C C C C
