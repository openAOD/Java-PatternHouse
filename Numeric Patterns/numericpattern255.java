import java.util.Scanner;

class NumericPattern255 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int num = 1;
        
        for (int i = height; i >= 1; i--) {
        
            for (int j = 1; j <= height; j++) {
                
                if(i == height || j == height || j == height-i+1) {
                    if(num <= 9) {
                        System.out.print(" " + num++ +" ");
                    }
                    else {
                        System.out.print(num++ +" ");
                    }
                    
                }
                else {
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 1  2  3  4  5
//    6        7
//       8     9
//         10 11
//            12
