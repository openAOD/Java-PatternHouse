import java.util.Scanner;
public class AlphabeticPattern121
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for(int k = 0; k <= n; k++) {
            for(int i = 0; i <= k; i++) {
                for(int j = 0; j <= i; j++) {
                    char c = (char)(i+65);
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
// B B
//
// A
// B B
// C C C
