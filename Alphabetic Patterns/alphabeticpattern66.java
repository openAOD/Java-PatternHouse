import java.util.Scanner;
public class AlphabeticPattern66
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
        
        char c = 'A';
        
        for(int i = 1; i < n+1; i++) {
            char ch = 'A';
            for(int j = 1; j < n+1; j++) {
                if(j >= i) {
                    System.out.print(c + " ");
                }
                else {
                    System.out.print(ch++ + " ");
                }
            }
            c++;
            System.out.println();
        }
        System.out.println();
    }
}

// Sample Input :- 5
// Output :-
// A A A A A
// A B B B B
// A B C C C 
// A B C D D
// A B C D E
