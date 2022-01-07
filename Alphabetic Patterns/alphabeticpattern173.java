import java.util.Scanner;
public class AlphabeticPattern173
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i=0;i<height;i++) {
            System.out.print("H ");
            for(int j=1;j<height;j++) {
                if(j == height-1 || i == height/2) {
                    System.out.print("H ");
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
// H       H
// H       H
// H H H H H
// H       H
// H       H
