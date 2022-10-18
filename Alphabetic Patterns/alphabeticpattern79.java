import java.util.Scanner;
class AlphabeticPattern79
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
      
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++) {
              
                if(i%2==0) {
                    System.out.print((char)(j+64) + " ");
                }
                else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 1 2 3 4 5
// A B C D
// 1 2 3
// A B
// 1
