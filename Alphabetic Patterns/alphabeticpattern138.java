import java.util.Scanner;
class AlphabeticPattern138
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt(); // Input no. of lines to be printed
        for(int i = 1; i <= n; i++) {
          
            for(int j = 1; j <= n-i; j++) {
                System.out.print("   ");
            }
          
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(j+64) + "  ");
            }
          
            for(int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//         A 1
//       A B 1 2
//     A B C 1 2 3
//   A B C D 1 2 3 4
// A B C D E 1 2 3 4 5
