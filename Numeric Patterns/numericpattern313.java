import java.util.Scanner;

class NumericPattern313 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 0; i < height; i++) {
        
            for (int j = 0; j < height; j++) {
                
                if(i == height/2 || j == height-1) {
                    System.out.print("* ");
                }
                else if(i < height/2 && j == 0) {
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
// *       *
// *       *
// * * * * *
//         *
//         *
