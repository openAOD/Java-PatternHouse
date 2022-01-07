import java.util.Scanner;
public class AlphabeticPattern132
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int size = s.nextInt(); // Input width of the pattern

        int x = 0;
        int y = size/2;
        char ch = (char)((height/2) + 66);
        
        for(int i = 0; i < height; i++) {
            if(i <= height/2) {
                char chr = (char)(i+65);
                for(int j = 0; j < size; j++) {
                    if(j >= x) {
                        System.out.print(chr + " ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                chr++;
                x++;
                System.out.println();
            }
            else {
                for(int j = 0; j < size; j++) {
                    if(j >= y) {
                        System.out.print(ch + " ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                ch++;
                y--;
                System.out.println();
            }
        }
        System.out.println();       
        
    }
}

// Sample Input :- 7
//                 4
// Output :-
// A A A A
//   B B B
//     C C
//       D
//     E E
//   F F F
// G G G G



