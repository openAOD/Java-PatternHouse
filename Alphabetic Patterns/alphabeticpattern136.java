import java.util.Scanner;
class AlphabeticPattern136
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt(); // Input no. of lines to be printed.
        int x = 1;
      
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print("   ");
            }
            for(int j = i; j <= x; j++) {
                System.out.print(j + "  ");
            }
            for(int j = i; j <= x; j++) {
                System.out.print((char)(j+64) + "  ");
            }
            System.out.println();
            x = x + 2;
        }
    }
}

// Sample Input :- 5
// Output :-
//         1 A
//       2 3 B C
//     3 4 5 C D E
//   4 5 6 7 D E F G
// 5 6 7 8 9 E F G H I
