import java.util.Scanner;

public class NumericPattern276 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int x = 1, y, sum = height*(height+1)/2;
        
        for (int i = 1; i <= height; i++) {
            y = sum-height+i;
        
            for (int j = 1; j <= height*2; j++) {
                
                if(j > 2*(i-1)) {
                    if( j <= (height*2)/2+i-1) {
                        if(x <= 9) {
                            System.out.print(" " + x++ + " ");
                        }
                        else {
                            System.out.print(x++ + " ");
                        }
                    }
                    else {
                        if(y <= 9) {
                            System.out.print(" " + y++ + " ");
                        }
                        else {
                            System.out.print(y++ + " ");
                        }
                    }  
                }
                else {
                    System.out.print("   ");
                }
            }
            sum = sum - height + i - 1;
            System.out.println();
        }
    }
}

// Sample Input :- 4
// Output :-
// 1  2  3  4  7  8  9 10
//       5  6  7  4  5  6
//             8  9  2  3
//                  10  1
