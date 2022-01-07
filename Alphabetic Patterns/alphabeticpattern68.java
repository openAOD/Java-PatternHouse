import java.util.Scanner;
public class AlphabeticPattern68
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
        
        char c = 'A';
        int x = 0;
        
        for(int i = 1; i < n+1; i++) {
            char ch = c;
            for(int j = 1; j < n+1; j++) {
                if(j <= x) {
                    System.out.print(c + " ");
                }
                else {
                    System.out.print(ch++ + " ");
                }
            }
            c++;
            x++;
            System.out.println();
        }
        System.out.println();
    }
}

// Sample Input :- 5
// Output :-
// A B C D E
// B B C D E
// C C C D E
// D D D D E
// E E E E E
