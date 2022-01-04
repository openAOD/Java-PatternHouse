import java.util.Scanner;
public class AlphabeticPattern134
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt(); // Input no. of lines to be printed
        for(int i = 1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(i + "  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print((char)(i+64) + "  ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//         1 A
//       2 2 B B
//     3 3 3 C C C 
//   4 4 4 4 D D D D
// 5 5 5 5 5 E E E E E
