import java.util.Scanner;
public class AlphabeticPattern139
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt(); // Input no. of lines to be printed
        int x = 1;    
  
        for(int i = 1; i <= n; i++) {
          
            for(int j = 1; j <= n-i; j++) {
                System.out.print("   ");
            }
          
            for(int j = i; j <= x; j++) {
                System.out.print((char)(j+64) + "  ");
            }
          
            for(int j = i; j <= x; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//         A 1
//       B C 2 3
//     C D E 3 4 5
//   D E F G 4 5 6 7
// E F G H I 5 6 7 8 9
