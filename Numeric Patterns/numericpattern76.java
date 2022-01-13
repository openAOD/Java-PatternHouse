import java.util.Scanner;

public class NumericPattern76 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int c = 2;
        
        for (int i = height; i >= 1; i--) {
            
            for(int j = 1;j <= height; j++) {
            
                if(i <= j) {
                    
                    if(c <= 9) {
                        System.out.print(" " + c + " ");
                    }
                    else {
                        System.out.print(c + " ");
                    }
                    c += 2;
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
//              2
//           4  6
//        8 10 12
//    14 16 18 20
// 22 24 26 28 30
