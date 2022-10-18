import java.util.Scanner;

class NumericPattern144 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 1; i <= height; i++) {
        
            for (int j = 1; j <= height; j++) {
                
                if(j == i) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
                
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 1 0 0 0 0
// 0 2 0 0 0
// 0 0 3 0 0
// 0 0 0 4 0
// 0 0 0 0 5
