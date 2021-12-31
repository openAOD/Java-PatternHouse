import java.util.Scanner;
public class StringPattern1
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int l = str.length();
        int n = s.nextInt();
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<l;j++) {
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
