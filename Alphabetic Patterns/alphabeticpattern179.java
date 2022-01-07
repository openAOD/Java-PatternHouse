import java.util.Scanner;

public class AlphabeticPattern179 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 1; i <= height; i++) {
            
            for(int j = 1; j <= height; j++) {
                if(j == 1 || j == height) {
                    System.out.print("N ");
                }
               else if(i == j) {
                    System.out.print("N ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}

// Sample Input :- 5
// Output :-
// N       N
// N N     N
// N   N   N
// N     N N
// N       N
