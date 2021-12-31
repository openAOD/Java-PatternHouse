import java.util.Scanner;
public class StringPattern4
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int l = str.length();
        for(int i=0;i<l;i++) {    //loop to print row
            for(int j=0;j<=(l-i-1);j++){    //loop to print value
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- HOUSE
// Output :-
// H O U S E
// H O U S
// H O U
// H O
// H
