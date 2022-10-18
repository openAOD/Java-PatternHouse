import java.util.Scanner;

class AlphabeticPattern183 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int half = height/2;
        int width = 2 * height - 1;
        
        for (int i = 0; i < height; i++) {
            System.out.print("R ");
            
            for (int j = 0; j < width; j++) {
            
                if((i == 0 || i == half) && j < width/2) {
                    System.out.print("R ");
                }
                else if(j == (width - 2) && !(i == 0 || i == half)) {
                    System.out.print("R ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
