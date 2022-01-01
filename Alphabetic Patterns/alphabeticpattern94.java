import java.util.Scanner;
public class AlphabeticPattern5
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
      
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=(n-i);j++) {
                System.out.print(" ");
            }
          
            for(int k=1;k<=i;k++) {
                if(i%2==0) {
                    System.out.print((char)(i+64) + " ");
                }
                else {
                    System.out.print(i+64 + " ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :- 
// 5 5 5 5 5
//  D D D D
//   3 3 3
//    B B 
//     1
