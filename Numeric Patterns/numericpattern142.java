import java.util.Scanner;

class NumericPattern142 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 0; i < height/2; i++) {
        
            for (int j = 0; j < height; j++) {
                System.out.print(0 + " ");
            }
            
            System.out.println();
        }
            
        for (int i = 0; i <= height/2; i++) {
        
            for (int j = 0; j < height; j++) {
                System.out.print(1 + " ");
            }
            
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 0 0 0 0 0
// 0 0 0 0 0
// 1 1 1 1 1
// 1 1 1 1 1
// 1 1 1 1 1
