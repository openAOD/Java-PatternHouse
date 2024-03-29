import java.util.Scanner;

class NumericPattern304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 1;i <= height; i++) {
            for(int j = 1; j <= height-i; j++) {
                System.out.print("   ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(j+64) + "  ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 
// Output :-
//         1 A
//       1 2 A B
//     1 2 3 A B C
//   1 2 3 4 A B C D
// 1 2 3 4 5 A B C D E
