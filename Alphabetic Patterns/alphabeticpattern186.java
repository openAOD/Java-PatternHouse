import java.util.Scanner;

class AlphabeticPattern186 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 1; i <= height; i++) {
            
            for(int j = 1; j <= height; j++) {
                if(i == height || j == 1 || j == height) {
                    System.out.print("U ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}

// Sample Input :- 5
// Output :-
// U       U
// U       U
// U       U
// U       U
// U U U U U
