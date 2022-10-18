import java.util.Scanner;

class NumericPattern141 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 1; i <= height; i++) {
        
            for (int j = 0; j < height/2; j++) {
                System.out.print(0 + " ");
            }
            
            for(int j = 0;j <= height/2; j++) {
                System.out.print(1 + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 0 0 1 1 1
// 0 0 1 1 1
// 0 0 1 1 1
// 0 0 1 1 1
// 0 0 1 1 1
