import java.util.Scanner;
public class AlphabeticPattern133
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int size = s.nextInt(); // Input width of the pattern
        
        int x = 0;
        int y = size/2;

        for(int i = 0; i < height; i++) {
            if(i <= height/2) {
                
                for(int j = 0; j < size; j++) {
                    char ch = (char)(j+65);
                    
                    if(j >= x) {
                        System.out.print(ch + " ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                x++;
                System.out.println();
            }
            else {
                for(int j = 0; j < size; j++) {
                    char ch = (char)(j+65);
                    if(j >= y) {
                        System.out.print(ch + " ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                y--;
                System.out.println();
            }
        }
    }
}

// Sample Input :- 7
//                 4
// Output :-
// A B C D
//   B C D
//     C D
//       D
//     C D
//   B C D
// A B C D

