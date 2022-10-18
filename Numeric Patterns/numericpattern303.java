import java.util.Scanner;

class NumericPattern303 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 1;i <= height; i++) {
            for(int j = 1; j <= height-i; j++) {
                System.out.print("   ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(i + "  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(i+64) + "  ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//         1 A
//       2 2 B B
//     3 3 3 C C C
//   4 4 4 4 D D D D
// 5 5 5 5 5 E E E E E
