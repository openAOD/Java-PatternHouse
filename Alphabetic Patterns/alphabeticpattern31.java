import java.util.Scanner;
class AlphabeticPattern31
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed 
        
        for(int i=0;i<n;i++) {
            for(int j=1;j<n-i;j++) {
                System.out.print(" ");
            }
          
            for(int k=0;k<=i;k++) {
                char x = (char)(i+65);
                System.out.print(x + " ");
            }
          
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//     A
//    B B
//   C C C
//  D D D D
// E E E E E
