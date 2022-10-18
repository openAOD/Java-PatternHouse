import java.util.Scanner;

class NumericPattern130 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 1; i <= height; i++) {
        
            for (int j = 1; j <= i; j++) {
                System.out.print(1 + " ");
            }
            for(int j = height; j > i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 1 5 4 3 2
// 1 1 5 4 3
// 1 1 1 5 4
// 1 1 1 1 5 
// 1 1 1 1 1
