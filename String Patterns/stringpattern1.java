import java.util.Scanner;
class StringPattern1
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine(); // Input String.
        int l = str.length(); 
        int n = s.nextInt(); // Input no. of times the value to be printed.
        
        for(int i=0;i<n;i++) { // Loop to print rows.
            for(int j=0;j<l;j++) { // Loop to print string.
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }
    }   
}


// Sample Input :- HOUSE 
//                 4
// Output :-
// H O U S E
// H O U S E
// H O U S E
// H O U S E
