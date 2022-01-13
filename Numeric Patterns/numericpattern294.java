import java.util.Scanner;

public class NumericPattern294 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int x = height/2+1;
        int num = 1;
        
        for(int i = 1; i <= height; i++) {
    
            for(int j = 1; j <= x; j++) {
                if(num <= 9) {
                    System.out.print(" " + num++ + " ");
                }
                else {
                    System.out.print(num++ + " ");
                }
            }
            
            if(i <= height/2) {
                x--;
            }
            else {
                x++;
            }
            System.out.println();
        }
    }
}

// Sample Input :- 7
// Output :-
//  1  2  3  4
//  5  6  7
//  8  9
// 10
// 11 12
// 13 14 15
// 16 17 18 19 
