import java.util.Scanner;

public class AlphabeticPattern177 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 0; i < height; i++) {
            System.out.print("L ");
            
            for(int j = 1; j < height; j++) {
                if(i == height-1) {
                    System.out.print("L ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}

// Sample Input :- 5
// L
// L
// L
// L
// L L L L L
