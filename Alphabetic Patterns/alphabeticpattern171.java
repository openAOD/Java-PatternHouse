import java.util.Scanner;
public class AlphabeticPattern171
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 0; i < height; i++) {
            System.out.print("F ");
            
            for(int j = 1; j < height; j++) {
            
                if((i == 0) || (i == (height/2) && j <=(height))) {
                    System.out.print("F ");
                }
                
                else {
                    continue;
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// F F F F F
// F
// F F F F F
// F
// F



