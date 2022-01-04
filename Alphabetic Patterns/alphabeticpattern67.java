import java.util.Scanner;
public class AlphabeticPattern66
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
         int x = 0;
      
        char c = 'E';
        
        for(int i = 1; i < n+1; i++) {
            char ch = 'A';
            for(int j = 1; j < n+1; j++) {
                if(j >= n+1-x) {
                    System.out.print(c + " ");
                }
                else {
                    System.out.print(ch++ + " ");
                }
            }
            c--;
            x++;
            System.out.println();
        }
        System.out.println();
    }
}

// Sample Input :- 5
// Output :-
// A B C D E
// A B C D D
// A B C C C 
// A B B B B
// A A A A A
