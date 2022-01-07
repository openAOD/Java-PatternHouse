import java.util.Scanner;
public class AlphabeticPattern166
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int width = 2*height;
        int n = width/2;
        
        for(int i = 0; i < height; i++) {
        
            for(int j = 0; j < width+1; j++) {
            
                if(j == n || j == (width - n) || (i == height/2 && j>n && j<(width - n))) {
                    System.out.print("A");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            --n;
        }
    }
}

// Sample Input :- 5
// Output :- 
//     A
//    A A
//   AAAAA
//  A     A
// A       A

