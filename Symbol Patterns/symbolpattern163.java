public class symbolpattern {

    public static void main(String []args) {
        int n = 7, x = n;
    
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 2*n; j++) {
                if(j == x || j == 2*n - x + 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            if(i % 2 == 0)
                x-= 2;
            
            System.out.println();
        }
    }
}