import java.util.Scanner ;
public class StringPattern7
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine(); // Input String
        int l = str.length(); // length of string
      
        int n = s.nextInt(); // Input no. of words to be printed in one line.
        int index = 0;
      
        for(int i=0;i<l/n;i++) { // loop to print rows
            for(int j=0;j<n;j++) { // loop to print values
                System.out.print(str.charAt(index++) + " ");
                if(index == l) {
                    break;
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- PatternHouse
                   4
// Output :-
// P a t t
// e r n H
// o u s e
