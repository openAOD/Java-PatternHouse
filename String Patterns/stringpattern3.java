import java.util.Scanner;
class StringPattern3
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int l = str.length();
        for(int i=0;i<l;i++) {    //loop to print row
            for(int j=0;j<=i;j++){    //loop to print value
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- HOUSE
// Output :-
// H
// H O 
// H O U
// H O U S
// H O U S E
