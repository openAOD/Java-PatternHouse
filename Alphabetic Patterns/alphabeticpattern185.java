import java.util.Scanner;
class AlphabeticPattern185
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 0; i < height; i++) {
            
            for(int j = 0; j < height; j++) {
            
                if(i == 0) {
                    System.out.print("T ");
                }
                else if(j == height/2) {
                    System.out.print("T ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// T T T T T
//     T
//     T
//     T
//     T
