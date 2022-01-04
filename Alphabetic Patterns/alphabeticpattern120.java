import java.util.Scanner;
public class AlphabeticPattern120
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt(); // Input no. of times pattern is to be printed.
        
        char c = 'A';
        
        for(int k = 1; k <= n; k++) {
            for(int i = 1; i <= k; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
            c++;
            System.out.println();
        }
    }
}

// Sample Input :- 3
// Output :-
// A
//
// B
// B B
//
// C
// C C
// C C C

