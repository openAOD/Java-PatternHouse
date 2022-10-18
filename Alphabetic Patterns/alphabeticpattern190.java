import java.util.Scanner;

class AlphabeticPattern190 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int counter = 0;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (i <=height/2 && (j == i || i == height-j+1))
                    System.out.print("Y ");
                else if(j == height/2+1 && i >= height/2+1) {
                    System.out.print("Y ");
                }
                else
                    System.out.print("  ");
            }
            
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// Y       Y
//   Y   Y
//     Y
//     Y
//     Y
