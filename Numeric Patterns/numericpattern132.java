import java.util.Scanner;

class NumericPattern132 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 1; i <= height; i++) {
        
            for (int j = i; j <= height; j++) {
                System.out.print(2*j-1 + " ");
            }
            for(int j = 1; j <= i-1; j++) {
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 1 3 5 7 9
// 3 5 7 9 1
// 5 7 9 1 3
// 7 9 1 3 5
// 9 1 3 5 7
