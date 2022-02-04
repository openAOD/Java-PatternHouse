public class symbolpattern {

    public static void main(String []args) {
        int height = 3, width = 4, space = width*2, x = 1;
    
        for(int i = 1; i <= height; i++) {
            for(int j = x; j <= width; j++) {
                for(int s = space; s >= j; s--) {
                    System.out.print(" ");
                }
                    
                for(int k = 1; k <= j; k++) {
                    System.out.print("* ");
                }
                    
                System.out.println();
            }
            x += 2;
            width += 2;
        }
        
        for(int i = 1; i <= 4; i++) {
            for(int s = space - 3; s >= 1; s--) {
                System.out.print(" ");
            }
                    
            for(int k = 1; k <= 4; k++) {
                System.out.print("* ");
            }
                    
            System.out.println();
        }
    }
}