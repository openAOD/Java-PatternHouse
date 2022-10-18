import java.util.Scanner;

class NumericPattern147 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 1; i <= height; i++) {
        
            for (int j = 0; j < i; j++) {
                System.out.print(height-i+1 + " ");
            }
            
            for(int j = i;j < height; j++) {
                System.out.print((char)(i + 64) + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 5 A A A A
// 4 4 B B B
// 3 3 3 C C
// 2 2 2 2 D
// 1 1 1 1 1
