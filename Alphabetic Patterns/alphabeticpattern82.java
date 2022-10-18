import java.util.Scanner;
class AlphabeticPattern82
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
        
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=(n-i);j++) {
                System.out.print(" ");
            }
            
            for(int k=1;k<=i;k++) {
                if(i%2==0) {
                    System.out.print((char)(i+64));
                }
                else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//     1
//    BB
//   333
//  DDDD
// 55555
