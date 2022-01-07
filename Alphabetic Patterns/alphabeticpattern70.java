import java.util.Scanner;
public class AlphabeticPattern70
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
        
        char c = 'A';
        boolean flag = true;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
              
                if(flag == true) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(c++ + " ");
                }
              
                flag = !flag;
            } 
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// * A * B *
// C * D * E
// * F * G *
// H * I * J
// * K * L *

