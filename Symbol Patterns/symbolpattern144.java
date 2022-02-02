public class symbolpattern {

    public static void main(String []args) {
        int n = 9,  x = 1;
    
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if((j <= x || j >= n - x + 1) && j % 2 == 1) {
                    System.out.print("* ");
                }
                else if((j >= x && j <= n - x + 1) && i % 2 == 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            
            if(i <= n/2)
                x++;
            else
                x--;
            
            System.out.println();
        }    
    }
}