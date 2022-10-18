import java.util.Scanner;

class NumericPattern176 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int c = 9;
        
        for(int i = height; i >= 1; i--) {
            
            for(int j = 1; j <= c; j++) {
                System.out.print(j + " ");
            }
            c -= 2;
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 1 2 3 4 5 6 7 8 9
// 1 2 3 4 5 6 7
// 1 2 3 4 5
// 1 2 3
// 1

