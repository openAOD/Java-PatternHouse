import java.util.Scanner;
public class AlphabeticPattern5
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
      
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++) {
              
                if(i%2==0) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print((char)(i+64) + " ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// E E E E E
// 4 4 4 4
// C C C
// 2 2
// A
