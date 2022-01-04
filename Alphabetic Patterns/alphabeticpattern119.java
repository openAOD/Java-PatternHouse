import java.util.Scanner;
public class AlphabeticPattern119
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
        int y = s.nextInt(); // Input no. of times pattern to be printed
        
        for(int k = 0; k < y; k++) {
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= i; j++) {
                    char c = (char)(j + 64);
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }
    }
}

// Sample Input :- 3
//                 2
// A
// A B
// A B C
// A
// A B
// A B C

