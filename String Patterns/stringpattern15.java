import java.util.Scanner;
public class StringPattern15
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine(); // Input String.
        int l = str.length();
        for(int i=0;i<l;i++) { 
            for(int j=0;j<l;j++) {
                if(i==l/2) {
                    System.out.print(str.charAt(j));
                }
                else if(j==l/2) {
                    System.out.print(str.charAt(i));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- ABCDE
// Output :-
//   A
//   B
// ABCDE
//   D
//   E
