import java.util.Scanner;
class AlphabeticPattern93
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
      
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=(n-i);j++) {
                System.out.print(" ");
            }
          
            for(int k=1;k<=i;k++) {
                if(i%2==0) {
                    System.out.print(k + " ");
                }
                else {
                    System.out.print((char)(k+64) + " ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// A B C D E
//  1 2 3 4
//   A B C
//    1 2
//     A
