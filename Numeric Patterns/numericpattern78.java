import java.util.Scanner;

public class NumericPattern78 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 1; i <= height; i++) {
            
            for(int j = height - 1; j >= i; j--) {
                System.out.print("   ");
            }
            
            for(int j = 1; j <= i; j ++) {
                int c = i*j;
            
                if(c <= 9) {
                    System.out.print(" " + c + " ");
                }
                else {
                    System.out.print(c + " ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//              1
//           2  4 
//        3  6  9
//     4  8 12 16
//  5 10 15 20 25
