public class symbolpattern {

    public static void main(String []args) {
        int n = 7, x = n/2 + 1;
    
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(j == x || j == n/2 + 1 || j == n - x + 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            x++;
            System.out.println();
        }    
    }
}