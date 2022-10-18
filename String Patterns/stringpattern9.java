import java.util.Scanner;
class StringPattern9
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine(); // Input String.
        int l = str.length();
      
        int n = s.nextInt(); // Input no. of lines to be printed
        int index = 0;
      
        for(int i=0;i<n;i++) { // Loop to print rows
            for(int j=0;j<=i;j++) { // Loop to print values 
                System.out.print(str.charAt(index++) + " ");
                if(index == l) {
                    index = 0;
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- PatternHouse
//                 5
// Output :-
// P
// a t
// t e r
// n H o u
// s e P a t
