import java.util.Scanner;
public class AlphabeticPattern170
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 0; i < height; i++) {
            System.out.print("E ");
            
            for(int j = 1; j < height; j++) {
            
                if((i == 0 || i == (height-1)) || (i == (height/2) && j <=(height))) {
                    System.out.print("E ");
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
// Output :-
// E E E E E
// E
// E E E E E
// E
// E E E EE


