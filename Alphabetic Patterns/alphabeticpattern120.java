import java.util.Scanner;
public class AlphabeticPattern118
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        char c = 'A';
        
        for(int k = 0; k <= n; k++) {
            for(int i = 0; i <= k; i++) {
                for(int j = 0; j <= i; j++) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
            c++;
            System.out.println();
        }
    }
}

// Sample Input :- 2
// Output :-
// A
//
// B
// B B
//
// C
// C C
// C C C

