import java.util.Scanner;
public class StringPattern2
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      
        String str = s.nextLine(); // Input the String.
        String rev = "";
        
        int l = str.length();
        int n = s.nextInt(); // Input no. of times the value to be printed.
        
        char ch;
        
        for (int i=0; i<l; i++) { // Loop to reverse the string.
            ch= str.charAt(i);
            rev= ch+rev;
        }
        
        for(int i=0;i<n;i++) { // Loop to print rows.
            for(int j=0;j<l;j++) { // Loop to print the string
                System.out.print(rev.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- HOUSE
//                 4
// Output :-
// E S U O H
// E S U O H
// E S U O H
// E S U O H
