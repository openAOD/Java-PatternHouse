import java.util.Scanner;

class NumericPattern124 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int k = 1;
        for (int i = 1; i <= height; i++) {
            if(i%2 != 0) {
                for (int j = 1; j <= height; j++) {
                    System.out.print(j + " ");
                }
            }
            
            else {
                for(int j = height; j > 0; j--) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }   
    }
}

// Sample Input :- 5
// Output :-
// 1 2 3 4 5 
// 5 4 3 2 1
// 1 2 3 4 5
// 5 4 3 2 1
// 1 2 3 4 5
