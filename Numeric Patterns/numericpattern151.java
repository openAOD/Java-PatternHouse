import java.util.Scanner;

class NumericPattern151 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 1; i <= height; i++) {
        
            for (int j = 1; j <= height-i+1; j++) {
                System.out.print(j + " ");
            }
            
            for(int j = 1;j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 1 2 3 4 5
// 1 2 3 4 *
// 1 2 3 * *
// 1 2 * * *
// 1 * * * *
