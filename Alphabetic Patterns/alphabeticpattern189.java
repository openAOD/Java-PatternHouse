import java.util.Scanner;

public class AlphabeticPattern189 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
    
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (j == i || i == height-j+1)
                    System.out.print("X ");
                
                else
                    System.out.print("  ");
            }
            
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// X       X
//   X   X
//     X
//   X   X
// X       X
