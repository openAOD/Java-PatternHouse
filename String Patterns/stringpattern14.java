import java.util.Scanner;
public class StringPattern14
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine(); // Input String
        int l = str.length();
        for(int i=0;i<l;i++) {    //loop to print row
            for(int j=0;j<i+1;j++) {    //loop to print values of upper triangle
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }
        for(int i=0;i<l-1;i++) {    //loop to print row
            for(int j=0;j<l-i-1;j++) {    //loop to print values of lower triangle
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

// Sample Input :- ARYA
// OUTPUT :-
// A
// A R
// A R Y
// A R Y A
// A R Y
// A R
// A
