public class symbolpattern {

    public static void main(String []args) {
        int n = 7;
    
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j < 2*n; j++) {
                if((j >= i && j <= 2*n - i) || j <= n - i + 1 || j >= n + i - 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }    
    }
}