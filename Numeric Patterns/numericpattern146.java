import java.util.Scanner;

class NumericPattern146 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 0; i < height; i++) {
        
            for (int j = height-i-1; j > 0; j--) {
                System.out.print(j + " ");
            }
            
            for(int j = 0;j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 4 3 2 1 0
// 3 2 1 0 1
// 2 1 0 1 2
// 1 0 1 2 3
// 0 1 2 3 4
