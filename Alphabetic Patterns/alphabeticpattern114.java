import java.util.Scanner;
class AlphabeticPattern114
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
        
        for(int i=0;i<n;i++) {
            for(int j=1;j<n-i;j++) {
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++) {
                char c = (char)(k+65);
                System.out.print(c + "   ");
            }
            System.out.println();
        }
        
        for(int i=n-1;i>0;i--) {
            for(int j=n;j>i;j--) {
                System.out.print("  ");
            }
            for(int k=n-i;k<n;k++) {
                char c = (char)(k+65);
                System.out.print(c + "   ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//         A
//       A   B
//     A   B   C
//   A   B   C   D
// A   B   C   D   E
//   B   C   D   E
//     C   D   E
//       D   E
//         E
