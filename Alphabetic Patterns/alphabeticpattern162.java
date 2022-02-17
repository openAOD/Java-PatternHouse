public class alphabeticpattern162 {

    public static void main(String []args) {
        int n = 5;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < 2*n - 2; j++) {
                if(j == 1 || j == 2*n - 3 || (j == n - i + 1 || j == n + i - 3) && i > 1) {
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