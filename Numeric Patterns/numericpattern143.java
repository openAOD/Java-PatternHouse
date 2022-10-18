import java.util.Scanner;

class NumericPattern143 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 0; i < height; i++) {
        
            for (int j = 0; j <= i; j++) {
                System.out.print(1 + " ");
            }
            
            for(int j = i;j < height-1; j++) {
                System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 1 0 0 0 0
// 1 1 0 0 0
// 1 1 1 0 0 
// 1 1 1 1 0
// 1 1 1 1 1
