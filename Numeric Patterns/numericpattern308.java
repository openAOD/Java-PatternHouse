import java.util.Scanner;

class NumericPattern308 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int x = 1;
        for(int i = 1;i <= height; i++) {
            for(int j = 1; j <= height-i;j++) {
                System.out.print("   ");
            }
            for(int j = i; j <= x; j++) {
                System.out.print((char)(j+64) + "  ");
            }
            for(int j = i; j <= x; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
            x = x + 2;
        }
    }
}

// Sample Input :- 5
// Output :-
//         A 1
//       B C 2 3
//     C D E 3 4 5
//   D E F G 4 5 6 7 
// E F G H I 5 6 7 8 9
