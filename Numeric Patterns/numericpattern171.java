import java.util.Scanner;

class NumericPattern171 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int c = 1;
        
        for(int i = 1; i <= height; i++) {
            
            for(int j = 1; j <= i; j++) {
                System.out.print(c + "# ");
                c++;
            }
            System.out.println();
        }
    }
}

// Sample Input :- 4
// Output :-
// 1#
// 2# 3#
// 4# 5# 6#
// 7# 8# 9# 10#
