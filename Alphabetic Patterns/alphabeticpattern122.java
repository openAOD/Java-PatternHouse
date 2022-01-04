import java.util.Scanner;
public class AlphabeticPattern121
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt(); // Input no. of times pattern is to be printed.
        
        for(int k = 1; k <= n; k++) {
            for(int i = 1; i <= k; i++) {
                for(int j = 1; j <= i; j++) {
                    char c = (char)(j+64);
                    System.out.print(c + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

// Sample Input :- 2
// Output :-
// A
//
// A
// A B
//
// A
// A B
// A B C



