import java.util.Scanner;

public class NumericPattern131 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 1; i <= height; i+=2) {
        
            for (int j = 0; j < height; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        for(int i = height-1; i >= 2; i-=2) {
            for(int j = 0; j < height; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :- 
// 1 1 1 1 1
// 3 3 3 3 3
// 5 5 5 5 5
// 4 4 4 4 4
// 2 2 2 2 2
