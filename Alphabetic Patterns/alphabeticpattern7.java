import java.util.Scanner;
class AlphabeticPattern7
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of words to be printed in each line
        
        for(int i=0;i<n;i++) {
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
// A F K P U
// B G L Q V
// C H M R W
// D I N S X
// E J O T Y
