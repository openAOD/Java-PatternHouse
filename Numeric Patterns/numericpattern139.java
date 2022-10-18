import java.util.Scanner;

class NumericPattern139 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 0; i < height; i++) {
        
            for (int j = 0; j < i; j++) {
                System.out.print(0 + " ");
            }
            
            for(int j = 1;j <= height-i; j++) {
                System.out.print(2*i+j + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 1 2 3 4 5
// 0 3 4 5 6
// 0 0 5 6 7
// 0 0 0 7 8
// 0 0 0 0 9
