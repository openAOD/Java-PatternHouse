import java.util.Scanner;

public class AlphabeticPattern191 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
    
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (i == 1 || i == height-j+1 || i == height)
                    System.out.print("Z ");
                
                else
                    System.out.print("  ");
            }
            
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// Z Z Z Z Z
//       Z
//     Z
//   Z
// Z Z Z Z Z
