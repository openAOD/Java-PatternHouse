import java.util.Scanner;

class NumericPattern42 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int x = height, y, num;
        for (int i = height; i >= 1; i--) {
        
            num = x;
            y = i + 1;
            
            for(int j = height; j >= i; j--) {
            
                if(num <= 9) {
                    System.out.print(" " + num + " ");
                }
                else {
                    System.out.print(num + " ");
                }
                
                num = num - y;
                y++;
            }
            x = x + i - 1;
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//  5
//  9  4
// 12  8  3
// 14 11  7  2
// 15 13 10  6  1
