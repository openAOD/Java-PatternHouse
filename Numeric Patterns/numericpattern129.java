import java.util.Scanner;

class NumericPattern129 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 1; i <= height; i++) {
        
            for (int j = i; j <= height; j++) {
                System.out.print(1 + " ");
            }
            for(int j = i-1; j >= 1; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 1 1 1 1 1
// 1 1 1 1 2
// 1 1 1 3 3
// 1 1 4 4 4 
// 1 5 5 5 5
