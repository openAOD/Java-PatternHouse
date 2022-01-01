import java.util.Scanner;
public class StringPattern13
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine(); // Input String
        int l = str.length();
      
        int n = s.nextInt(); // Input no. of lines to be printed
        int index = 0;
      
        for(int i=0;i<=n;i++) { // Loop to print rows.
            for(int j=n;j>i;j--) { // Loop to print spaces.
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++) { // Loop to print value.
                System.out.print(str.charAt(index++));
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
//     P
//    att
//   ernHo
//  usePatt
// ernHouseP
