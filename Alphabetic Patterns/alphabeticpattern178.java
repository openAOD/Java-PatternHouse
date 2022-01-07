import java.util.Scanner;

public class AlphabeticPattern178 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        int counter = 0;
        for(int i = 0; i < height; i++) {
            System.out.print("M ");
            
            for(int j = 1; j <= height; j++) {
                if(j == height-1) {
                    System.out.print("M ");
                }
                else if(j == counter || j == height-counter-1) {
                    System.out.print("M ");
                }
                else {
                    System.out.print("  ");
                }
            }
            if(counter == height/2) {
                counter = -99999;
            }
            else {
                counter++;
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :- 5
// M       M
// M M   M M
// M   M   M
// M       M
// M       M
