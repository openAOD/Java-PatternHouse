import java.io.*;
import java.util.Scanner;
public class StringPattern2
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      
        String str = s.nextLine();
        String rev = "";
        
        int l = str.length();
        int n = s.nextInt();
        
        char ch;
        
        for (int i=0; i<l; i++) {
            ch= str.charAt(i);
            rev= ch+rev;
        }
        
        for(int i=0;i<n;i++) {
            System.out.println(rev);
        }
    }
}

// Sample Input :- HOUSE
//                 4
// Output :-
// ESUOH
// ESUOH
// ESUOH
// ESUOH
