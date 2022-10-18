import java.util.Scanner;
class AlphabeticPattern8
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of words to be printed in each line
        for(int i=n-1;i>=0;i--) {
            for(int j=0;j<n;j++) {
                char c = (char)(i+j*5+65);
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// E J O T Y
// D I N S X
// C H M R W
// B G L Q V
// A F K P U
