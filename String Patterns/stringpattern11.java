import java.util.Scanner;
class StringPattern11
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine(); // Input String.
        int l = str.length();
        String rev = "";
        char ch;
        
        for(int i=0;i<l;i++) {    //loop to reverse the string.
            ch = str.charAt(i);
            rev = ch + rev;
        }
      
        for(int i=0;i<l;i++) {    //loop to print rows.
            for(int j=l-1;j>i;j--) {    //loop to print spaces.
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {    //loop to print value.
                System.out.print(rev.charAt(k));
            }
            System.out.println();
        }
    }
}

// Sample Input :- HOUSE
// Output :-
//     E
//    ES
//   ESU
//  ESUO
// ESUOH
