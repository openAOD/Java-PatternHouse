import java.util.Scanner;
public class AlphabeticPattern113
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
        
        for(int i=0;i<n;i++) {
            for(int j=1;j<n-i;j++) {
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++) {
                char c = (char)(i+65);
                System.out.print(c + "   ");
            }
            System.out.println();
        }
        
        for(int i=n-1;i>0;i--) {
            for(int j=n;j>i;j--) {
                System.out.print("  ");
            }
            for(int k=i;k>0;k--) {
                char c = (char)(i+64);
                System.out.print(c + "   ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//         A
//       B   B
//     C   C   C
//   D   D   D   D
// E   E   E   E   E
//   D   D   D   D
//     C   C   C
//       B   B
//         A

