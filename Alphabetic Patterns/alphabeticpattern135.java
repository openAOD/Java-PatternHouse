import java.util.Scanner;
class AlphabeticPattern135
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt(); // Input no. of lines to be printed
        for(int i = 1;i <= n; i++) {
          
            for(int j = 1;j <= n-i; j++) {
                System.out.print("   ");
            }
          
            for(int j = 1;j <= i; j++) {
                System.out.print(j + "  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(j+64) + "  ");
            }
          
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//         1 A
//       1 2 A B
//     1 2 3 A B C
//   1 2 3 4 A B C D
// 1 2 3 4 5 A B C D E
