import java.util.Scanner;

class AlphabeticPattern184 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 0; i < height; i++) {
            
            for(int j = 1; j <= height; j++) {
                if(i == 0 || i == height/2 || i == height-1) {
                    System.out.print("S ");
                }
                else if(i < height/2 && j == 1) {
                    System.out.print("S ");
                }
                else if(i > height/2 && j == height) {
                    System.out.print("S ");
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
// S S S S S
// S
// S S S S S
//         S
// S S S S S
