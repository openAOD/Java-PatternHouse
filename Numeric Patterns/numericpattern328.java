import java.util.Scanner;

public class NumericPattern328 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 0; i < height; i++) {
        
            for (int j = 0; j < height; j++) {
                
                if(i == 0 || i == height/2 || i == height-1 || j == height-1) {
                    System.out.print("9 ");
                }
                else if(j == 0 && i <= height/2) {
                    System.out.print("9 ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 9 9 9 9 9
// 9       9
// 9 9 9 9 9
//         9
// 9 9 9 9 9 
