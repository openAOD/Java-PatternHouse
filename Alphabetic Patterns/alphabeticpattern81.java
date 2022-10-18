import java.util.Scanner;
class AlphabeticPattern81
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
        
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=(n-i);j++) {
                System.out.print(" ");
            }
            
            for(int k=1;k<=i;k++) {
                if(i%2==0) {
                    System.out.print(k);
                }
                else {
                    System.out.print((char)(k+64));
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//     A
//    12
//   ABC
//  1234
// ABCDE

