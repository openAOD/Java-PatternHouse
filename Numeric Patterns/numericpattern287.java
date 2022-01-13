import java.util.Scanner;

public class NumericPattern287 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int p = 0;
        
        for(int i = 1; i <= height; i++) {
            p = i;
            
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            
            for(int j = 1; j < 2*(height - i); j++) {
                System.out.print("  ");
            }
            
            if(i == height) {
                p--;
            }
            for(int j = 1; j <= p; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        for(int i = height+1; i < 2*height; i++) {
    
            for(int j = 1; j <= 2*height-i; j++) {
                System.out.print(i + " ");
            }
            
            for(int j = 1; j < 2*(i-height); j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= (2 * height) - i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 4
// Output :-
// 1           1
// 2 2       2 2
// 3 3 3   3 3 3
// 4 4 4 4 4 4 4
// 5 5 5   5 5 5
// 6 6       6 6
// 7           7
