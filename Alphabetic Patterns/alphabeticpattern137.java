import java.util.Scanner;
class AlphabeticPattern137
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt(); // Input no. of lines to be printed
        for(int i = 1; i <= n; i++) {
          
            for(int j = 1; j <= n-i; j++) {
                System.out.print("   ");
            }
          
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(i+64) + "  ");
            }
          
            for(int j = 1; j <= i; j++) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//         A 1
//       B B 2 2
//     C C C 3 3 3
//   D D D D 4 4 4 4
// E E E E E 5 5 5 5 5
