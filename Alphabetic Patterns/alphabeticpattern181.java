import java.util.Scanner;

public class AlphabeticPattern181 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 0; i < height; i++) {
            System.out.print("P ");
            
            for (int j = 1; j <= height; j++) {
                if ((i == 0 || i == height / 2) && j < height - 1)
                    System.out.print("P ");
                else if (i < height / 2 && j == height && i != 0)
                    System.out.print("P ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// P P P P 
// P     P
// P P P P 
// P
// P
