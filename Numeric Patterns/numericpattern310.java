import java.util.Scanner;

class NumericPattern310 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 1; i <= height; i++) {
        
            for(int j = 1; j <= height; j++) {
            
                if(i == height || j == height/2+1) {
                    System.out.print("* ");
                }
                
                else if(j == height/2-i+1) {
                    System.out.print("* ");
                }
                
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//   * *
// *   *
//     *
//     *
// * * * * *
