import java.util.Scanner;

class NumericPattern306 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 1;i <= height; i++) {
            for(int j = 1; j <= height-i; j++) {
                System.out.print("   ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print((char)(i+64) + "  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//          A 1
//        B B 2 2
//      C C C 3 3 3
//    D D D D 4 4 4 4
//  E E E E E 5 5 5 5 5  
