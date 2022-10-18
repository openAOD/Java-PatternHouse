import java.util.Scanner;
class AlphabeticPattern73
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
      
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                
                if(i%2==0) {
                    System.out.print(j + " ");
                }
                else {
                    System.out.print((char)(j+64) + " ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// A
// 1 2
// A B C
// 1 2 3 4
// A B C D E
