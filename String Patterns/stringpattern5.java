import java.util.Scanner;
class StringPattern5
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int l = str.length();
        for(int i=0;i<l;i++) {    //loop to print row
            for(int j=l-1;j>i;j--){    //loop to print spaces
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {    //loop to print value
                System.out.print(str.charAt(k));
            }
            System.out.println();
        }
    }
}

// Sample Input :- HOUSE
// Output :-
//     H
//    HO
//   HOU
//  HOUS
// HOUSE
