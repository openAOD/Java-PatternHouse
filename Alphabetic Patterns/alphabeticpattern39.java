import java.util.Scanner;
public class AlphabeticPattern39
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Input no. of lines to be printed
      
         for(int i=0;i<n;i++) {
            for(int j=1;j<n-i;j++) {
              
                System.out.print("  ");
            }
            for(int j=2*i+1;j>0;j--) {
                char c = (char)(64+j);
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output
//         A
//       C B A
//     E D C B A
//   G F E D C B A
// I H G F E D C B A
