import java.util.Scanner;
public class AlphabeticPattern83
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
                    System.out.print((char)(k+64));
                }
                else {
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//     1
//    AB
//   123
//  ABCD
// 12345
