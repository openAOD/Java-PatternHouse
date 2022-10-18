import java.util.Scanner;
class AlphabeticPattern6
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of words to be printed in each line

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                char c = (char)(i+j+65);
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :- 
// A B C D E 
// B C D E F 
// C D E F G
// D E F G H
// E F G H I
