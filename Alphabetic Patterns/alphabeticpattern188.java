import java.util.Scanner;

public class AlphabeticPattern188 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int counter = height/2;
        
        for (int i = 0; i < height; i++) {
            //System.out.print("W ");
            
            for(int j = 0;j <= height; j++) {
                
                if(j == 0 || j == height - 1) {
                    System.out.print("W ");
                }
                else if((i >= height/2) && (j == counter || j == height - counter - 1)) {
                    System.out.print("W ");
                }
                else {
                    System.out.print("  ");
                }
            }
            if(i >= height/2) {
                counter++;
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// W       W
// W       W
// W   W   W
// W W   W W
// W       W
